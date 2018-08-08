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
		 * ��ѯ����
		 */
		return stuInfoMapper.selectByExample(null);
	}
	
	
	/**
	 * ��Ϣ���淽��
	 * @param stuInfo
	 */
	public void saveStuInfo(StuInfo stuInfo) {
		// TODO Auto-generated method stub
		stuInfoMapper.insertSelective(stuInfo);
	}

	/**
	 * У��Ա�����Ƿ��ظ�
	 * @param infoName
	 * @return
	 * return true ����ǰ���ݿ���   flase ������
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
	 * ����Id�鵽��Ӧ��Ϣ
	 * @param infoId
	 * @return
	 */
	public StuInfo getInfo(Integer infoId) {
		// TODO Auto-generated method stub
		StuInfo stuInfo = stuInfoMapper.selectByPrimaryKey(infoId);
		return stuInfo;
	}	
	/**
	 * �޸�Ա����Ϣ��ʱ���������ݻ���
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
 	 * ɾ��
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


