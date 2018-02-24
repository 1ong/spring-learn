package com.learn.spring.entity;

/**
 * @author yunlongpang 2018/2/24
 */
public class UserInfo {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;


    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * bean初始化方法,private与public修饰均可
     */
    private void initMethod() {
        System.out.println("user info init.");
    }

    /**
     * bean销毁方法,private与public修饰均可
     */
    private void destroyMethod() {
        System.out.println("user info destroy.");
    }
}
