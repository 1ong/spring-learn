package com.learn.spring.beans.entity;

/**
 * @author yunlongpang 2018/3/2
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

    public UserInfo() {
        //若BeanFactoryPostProcessor实现没有提前初始化,则在其执行完成后才会初始化
        System.out.println("UserInfo instance create");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
