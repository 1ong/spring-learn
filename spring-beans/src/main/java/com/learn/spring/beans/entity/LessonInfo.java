package com.learn.spring.beans.entity;

/**
 * @author yunlongpang 2018/3/2
 */
public class LessonInfo {

    /**
     * 教师
     */
    private String teacher;

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "LessonInfo{" +
                "teacher='" + teacher + '\'' +
                '}';
    }
}
