package com.newStdd.struts.action;

import com.newStdd.struts.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    
    /*
     * 我们通过Spring的IOC容器注入LoginService，从而减少类之间的依赖关系
     */
    private LoginService loginService;
    
    public LoginService getLoginService()
    {
        return loginService;
    }
    public void setLoginService(LoginService loginService)
    {
        this.loginService = loginService;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String init() throws Exception
    {
    	return INPUT;
    }
    
    public String login() throws Exception
    {
    	return SUCCESS;
    }
}
