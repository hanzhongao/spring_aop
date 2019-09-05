package com.hza.aop.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Create by hza
 * 2019-09-05 21:31
 */
public class MyJdkProxy implements InvocationHandler {

    private Object object ;

    public MyJdkProxy(Object object) {
        this.object = object ;
    }

    public Object getProxy() {
        Object proxy = Proxy.newProxyInstance(this.object.getClass().getClassLoader()
                ,this.object.getClass().getInterfaces(),this) ;
        return proxy ;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("save".equals(method.getName())) {
            System.out.println("权限校验。。。。。。。。");
            return method.invoke(this.object,args) ;
        } else {
            return method.invoke(this.object,args) ;
        }
    }
}
