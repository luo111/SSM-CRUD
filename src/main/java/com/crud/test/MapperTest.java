package com.crud.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crud.bean.StuInfo;
import com.crud.dao.StuInfoMapper;

/**
 * ����dao��
 * @author LY
 * spring ��Ŀ����ʹ��spring�ĵ�Ԫ����
 * @ContextConfiguration ָ��spring�����ļ���λ��
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	StuInfoMapper stuInfoMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void testCRUD() {
	/*
	 * //1.����sprinig IOC����
	ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
	ioc.getBean(StuInfoMapper.class);
	*/
		
	System.out.println(stuInfoMapper);
	
	//�����������
	//stuInfoMapper.insertSelective(new StuInfo(1, "zhangsan", "M", "1001",
	//		"1001@1001.com", "1001", "1001", "1001"));
			
	//��������,����ʹ��SqlSession
	
	StuInfoMapper mapper = sqlSession.getMapper(StuInfoMapper.class);
		for (int i=0;i<25;i++) {
			String uid= UUID.randomUUID().toString().substring(0,5);
			mapper.insert(new StuInfo(null, uid, "M", "1001", uid+"@1001", "1001", "1001", "1001"));
		}
		System.out.println("�����������");
		
	}

}
