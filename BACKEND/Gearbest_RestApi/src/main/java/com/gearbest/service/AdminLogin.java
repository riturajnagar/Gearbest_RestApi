package com.gearbest.service;

import com.gearbest.exception.LoginException;
import com.gearbest.model.Login;

public interface AdminLogin {

	public String adminLog(Login dto) throws LoginException;

	public String adminLogOut(String key) throws LoginException;

}
