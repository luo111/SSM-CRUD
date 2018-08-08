package com.crud.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.bean.Login;
import com.crud.dao.LoginMapper;

@Service
public class LoginService {
	@Autowired
	LoginMapper loginMapper;
	
	public Map<String, Object> checkStuInfo(String username,String password){
		// TODO Auto-generated method stub
				Login stuInfo = new Login();
				stuInfo.setUsername(username);
				stuInfo.setPassword(password);
				Login stuInfoResult = new Login();
				stuInfoResult = loginMapper.checkInfo(stuInfo);
				Map<String, Object> resultMap = new HashMap();
				resultMap.put("result", false);
				if(stuInfoResult != null){
					resultMap.put("result", true);
				}else{
					resultMap.put("warning", "warning");
				}
				
				return resultMap;
	}
	
}