package com.thbpowernode.springboot.service;

import com.thbpowernode.springboot.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {
    /**
     * 根据学生ID查询详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
