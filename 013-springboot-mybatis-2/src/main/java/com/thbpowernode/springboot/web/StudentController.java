package com.thbpowernode.springboot.web;

import com.thbpowernode.springboot.model.Student;
import com.thbpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public @ResponseBody Student queryStudentById(Integer id){

        //调用业务层方法
        Student student = studentService.queryStudentById(id);

        return student;
    }
}
