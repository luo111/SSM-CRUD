package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.bean.StuInfo;
import com.crud.bean.StuInfoExample;
import com.crud.bean.StuInfoExample.Criteria;
import com.crud.dao.StuInfoMapper;

@Service
public class StuInfoService {

	@Autowired
	StuInfoMapper stuInfoMapper;
	public List<StuInfo> getAll() {
		// TODO Auto-generated method stub
		/**
		 * 查询所有
		 */
		return stuInfoMapper.selectByExample(null);
	}
	
	
	/**
	 * 信息保存方法
	 * @param stuInfo
	 */
	public void saveStuInfo(StuInfo stuInfo) {
		// TODO Auto-generated method stub
		stuInfoMapper.insertSelective(stuInfo);
	}

	/**
	 * 校检员工名是否重复
	 * @param infoName
	 * @return
	 * return true 代表当前数据可用   flase 不可用
	 */
	public boolean checkuser(String infoName) {
		// TODO Auto-generated method stub
		StuInfoExample stuInfoExample=new StuInfoExample();
		Criteria criteria=stuInfoExample.createCriteria();
		criteria.andInfoNameEqualTo(infoName);
		long count = stuInfoMapper.countByExample(stuInfoExample);
		return count==0;
	}


	/**
	 * 按照Id查到对应信息
	 * @param infoId
	 * @return
	 */
	public StuInfo getInfo(Integer infoId) {
		// TODO Auto-generated method stub
		StuInfo stuInfo = stuInfoMapper.selectByPrimaryKey(infoId);
		return stuInfo;
	}	
	/**
	 * 修改员工信息的时候用于数据回显
	 * @param id
	 * @return
	 */
	/*public StuInfo getStuInfo(int infoId) {
		StuInfo stuInfo = stuInfoMapper.selectByPrimaryKey(infoId);
		 return stuInfo;
	}
*/


 public void updateInfo(StuInfo stuInfo) {
		// TODO Auto-generated method stub
		stuInfoMapper.updateByPrimaryKeySelective(stuInfo);
	}


 	/**
 	 * 删除
 	 * @param infoId
 	 */
	public void deleteStuInfoId(Integer infoId) {
		// TODO Auto-generated method stub
		stuInfoMapper.deleteByPrimaryKey(infoId);
	}
	
	public void deleteAll(List<Integer> infoIds) {
		StuInfoExample example = new StuInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andInfoIdIn(infoIds);
		//delete from xxx where emp_id in (1,2,3);
		stuInfoMapper.deleteByExample(example);
	}
}


