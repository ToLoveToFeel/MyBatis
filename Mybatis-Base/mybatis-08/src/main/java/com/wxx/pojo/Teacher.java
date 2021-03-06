package com.wxx.pojo;

import lombok.Data;

import java.util.List;

/**
 * Date: 2020/11/11 20:55
 * Content:
 */
@Data
public class Teacher {

    private int id;
    private String name;

    // 一个老师拥有多个学生
    List<Student> students;
}
