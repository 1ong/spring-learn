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
