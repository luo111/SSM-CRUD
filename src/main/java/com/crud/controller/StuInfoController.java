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
 * 处理员工CRUD请求
 * @author LY
 *
 */
@Controller
public class StuInfoController {
	
	@Autowired
	StuInfoService stuInfoService;
	
	/**
	 * 导入jackson包 把对象转换成JSON字符串 第二稿 支持移动设备
	 * 
	 * @param pn
	 * @return
	 */
	
	
	@RequestMapping("/stuInfo")
	@ResponseBody
	public Msg getStuInfoWithJson(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
				//这是一个分页查询
				// 引入PageHelper分页插件
				// 查询前调用，传入页码和记录数
				PageHelper.startPage(pn, 5);
				// startPage紧跟着的这个查询就是一个分页查询
				List<StuInfo> stuInfos=stuInfoService.getAll();
				// PageInfo包装查询结果，封装了详细的分页信息和详细数据
				// 连续显示5页
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
			 * 一种实现 for (String str : strIds) {
			 * employeeService.deleteEmp(Integer.parseInt(str)); }
			 */
			// 另一种实现
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
	 * 查询员工数据 分页查询
	 * @return
	 */
	//@RequestMapping("/stuInfo")
	public String getStuInfo(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
		//这是一个分页查询
		//引入PageHelper 传入页码以及每页的大小
		PageHelper.startPage(pn, 5);
		List<StuInfo> stuInfos=stuInfoService.getAll();
		PageInfo pageInfo=new PageInfo(stuInfos,5);
		model.addAttribute("pageInfo", pageInfo);
		return "list";
	}
	
	
	/**
	 * 校验用户名是否被占用
	 * @param empName
	 * @return
	 */
	@RequestMapping(value = "/checkuser", method = RequestMethod.POST)
	@ResponseBody
	public Msg checkuser(@RequestParam("infoName") String infoName) {
		// 判断用户名是否符合正则表达式

		String regex = "(^[A-Za-z0-9]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)";
		if (!infoName.matches(regex)) {
			// System.out.println(empName.matches(regex));
			return Msg.failure().add("va_msg", "名字必须是2-5个中文或者6-16位英文数字组合");
		}

		if (stuInfoService.checkuser(infoName)) {
			return Msg.success();
		} else {
			return Msg.failure().add("va_msg", "用户名不可用");
		}
	}

	
	/**
	 * 更新信息
	 */
	@RequestMapping(value ="/stuInfo/{infoId}", method = RequestMethod.PUT)
	@ResponseBody
	public Msg updateStuInfo(StuInfo stuInfo) {
		System.out.println(stuInfo);
		stuInfoService.updateInfo(stuInfo);
		return Msg.success();
	}
	
	
	/**
	 * 保存员工信息
	 */
	@RequestMapping(value = "/stuInfo", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveStuInfo(StuInfo stuInfo) {
			stuInfoService.saveStuInfo(stuInfo);
			return Msg.success();

	}

	/**
	 * 查询信息 
	 */
	@RequestMapping(value = "/stuInfo/{infoId}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getInfo(@PathVariable("infoId") Integer infoId) {
		StuInfo stuInfo = stuInfoService.getInfo(infoId);
		return Msg.success().add("stuInfo", stuInfo);
	}
	
}
