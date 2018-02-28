package com.learn.spring.properties.entity;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author yunlongpang 2018/2/28
 */
public class LessonInfo {
    /**
     * 课程名称
     */
    @Value("${lesson.name}")
    private String lesson;

    /**
     * 学期
     */
    @Value("${lesson.semester}")
    private int semester;

    @Override
    public String toString() {
        return "LessonInfo{" +
                "lesson='" + lesson + '\'' +
                ", semester=" + semester +
                '}';
    }
}
