package com.hza.aop.demo1;

import org.junit.Test;

/**
 * Create by hza
 * 2019-09-05 21:39
 */
public class SpringDemo1 {
    @Test
    public void test1() {
        UserDao userDao = new UserDaoImpl() ;
        UserDao proxy = (UserDao) new MyJdkProxy(userDao).getProxy();

        proxy.find();
        proxy.delete();
        proxy.save();
        proxy.update();
    }
}
