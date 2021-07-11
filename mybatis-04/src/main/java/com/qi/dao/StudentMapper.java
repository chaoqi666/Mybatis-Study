package com.qi.dao;

import com.qi.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有学生信息，以及对应老师信息
    public List<Student> getStudentInfo();

    public List<Student> getStudentInfo2();
}
