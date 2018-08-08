package com.crud.dao;


import org.springframework.stereotype.Component;

import com.crud.bean.Login;

@Component
public interface LoginMapper {
	public Login checkInfo(Login stuInfo);
}
