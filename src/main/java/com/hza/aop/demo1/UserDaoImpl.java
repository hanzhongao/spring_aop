package com.hza.aop.demo1;

/**
 * Create by hza
 * 2019-09-05 21:29
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void find() {
        System.out.println("查找用户...");
    }

    @Override
    public void delete() {
        System.out.println("删除用户...");
    }

    @Override
    public void save() {
        System.out.println("保存用户...");
    }

    @Override
    public void update() {
        System.out.println("修改用户...");
    }
}
