package com.thbpowernode.springboot.service.impl;

import com.thbpowernode.springboot.mapper.StudentMapper;
import com.thbpowernode.springboot.model.Student;
import com.thbpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
