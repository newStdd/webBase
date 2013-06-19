package com.newStdd.struts;


public class LoginService
{
    /*
     * 我们这只是一个小的例子，不与数据库打交到
     * 若有数据库操作，那么在这个LoginService就是操作具体Dao类实现登录的相关操作
     */
    public boolean validate(String username,String password)throws Exception
    {
        boolean v = false;
        if(!"xcp".equals(username))//如果用户名不等于xcp，就抛出一个异常
        {
            throw new Exception("用户名不正确");
        }
        else if(!"123".equals(password))//如果密码不等于123，就抛出一个异常

        {
            throw new Exception("密码不正确");
        }
        else
        {
            v = true;            
        }
        return v;
    }
}
