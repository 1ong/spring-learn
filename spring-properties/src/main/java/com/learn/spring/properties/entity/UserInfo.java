package com.learn.spring.properties.entity;

/**
 * @author yunlongpang 2018/2/28
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



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
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
