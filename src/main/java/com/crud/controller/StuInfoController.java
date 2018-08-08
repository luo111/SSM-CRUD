package com.crud.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.crud.bean.Msg;
import com.crud.bean.StuInfo;
import com.crud.service.StuInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ����Ա��CRUD����
 * @author LY
 *
 */
@Controller
public class StuInfoController {
	
	@Autowired
	StuInfoService stuInfoService;
	
	/**
	 * ����jackson�� �Ѷ���ת����JSON�ַ��� �ڶ��� ֧���ƶ��豸
	 * 
	 * @param pn
	 * @return
	 */
	
	
	@RequestMapping("/stuInfo")
	@ResponseBody
	public Msg getStuInfoWithJson(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
				//����һ����ҳ��ѯ
				// ����PageHelper��ҳ���
				// ��ѯǰ���ã�����ҳ��ͼ�¼��
				PageHelper.startPage(pn, 5);
				// startPage�����ŵ������ѯ����һ����ҳ��ѯ
				List<StuInfo> stuInfos=stuInfoService.getAll();
				// PageInfo��װ��ѯ�������װ����ϸ�ķ�ҳ��Ϣ����ϸ����
				// ������ʾ5ҳ
				PageInfo pageInfo=new PageInfo(stuInfos,5);
				return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	/**
	 * 
	 */
	 
	@RequestMapping(value = "/stuInfo/{infoIds}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmpById(@PathVariable("infoIds") String ids) {
		if (ids.contains("-")) {
			String[] strIds = ids.split("-");
			/*
			 * һ��ʵ�� for (String str : strIds) {
			 * employeeService.deleteEmp(Integer.parseInt(str)); }
			 */
			// ��һ��ʵ��
			List<Integer> del_ids = new ArrayList<Integer>();
			for (String str : strIds) {
				del_ids.add(Integer.parseInt(str));
			}
			stuInfoService.deleteAll(del_ids);

		} else {
			stuInfoService.deleteStuInfoId(Integer.parseInt(ids));
		}
		return Msg.success();
	}
	
	
	/**
	 * ��ѯԱ������ ��ҳ��ѯ
	 * @return
	 */
	//@RequestMapping("/stuInfo")
	public String getStuInfo(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
		//����һ����ҳ��ѯ
		//����PageHelper ����ҳ���Լ�ÿҳ�Ĵ�С
		PageHelper.startPage(pn, 5);
		List<StuInfo> stuInfos=stuInfoService.getAll();
		PageInfo pageInfo=new PageInfo(stuInfos,5);
		model.addAttribute("pageInfo", pageInfo);
		return "list";
	}
	
	
	/**
	 * У���û����Ƿ�ռ��
	 * @param empName
	 * @return
	 */
	@RequestMapping(value = "/checkuser", method = RequestMethod.POST)
	@ResponseBody
	public Msg checkuser(@RequestParam("infoName") String infoName) {
		// �ж��û����Ƿ����������ʽ

		String regex = "(^[A-Za-z0-9]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)";
		if (!infoName.matches(regex)) {
			// System.out.println(empName.matches(regex));
			return Msg.failure().add("va_msg", "���ֱ�����2-5�����Ļ���6-16λӢ���������");
		}

		if (stuInfoService.checkuser(infoName)) {
			return Msg.success();
		} else {
			return Msg.failure().add("va_msg", "�û���������");
		}
	}

	
	/**
	 * ������Ϣ
	 */
	@RequestMapping(value ="/stuInfo/{infoId}", method = RequestMethod.PUT)
	@ResponseBody
	public Msg updateStuInfo(StuInfo stuInfo) {
		System.out.println(stuInfo);
		stuInfoService.updateInfo(stuInfo);
		return Msg.success();
	}
	
	
	/**
	 * ����Ա����Ϣ
	 */
	@RequestMapping(value = "/stuInfo", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveStuInfo(StuInfo stuInfo) {
			stuInfoService.saveStuInfo(stuInfo);
			return Msg.success();

	}

	/**
	 * ��ѯ��Ϣ 
	 */
	@RequestMapping(value = "/stuInfo/{infoId}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getInfo(@PathVariable("infoId") Integer infoId) {
		StuInfo stuInfo = stuInfoService.getInfo(infoId);
		return Msg.success().add("stuInfo", stuInfo);
	}
	
}
