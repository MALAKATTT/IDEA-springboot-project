package com.thbpowernode.springboot.web;

import com.thbpowernode.springboot.model.Student;
import com.thbpowernode.springboot.service.StudentService;
import com.thbpowernode.springboot.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public @ResponseBody Object student(Integer id){
        Student student = studentService.queryStudentById(id);
        return student;
    }
}
