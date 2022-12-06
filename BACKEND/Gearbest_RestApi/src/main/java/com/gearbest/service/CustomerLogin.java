package com.gearbest.service;

import com.gearbest.exception.LoginException;
import com.gearbest.model.Login;

public interface CustomerLogin {
	
	public String logIntoAccount(Login dto)throws LoginException;

	public String logOutFromAccount(String key)throws LoginException;

}
