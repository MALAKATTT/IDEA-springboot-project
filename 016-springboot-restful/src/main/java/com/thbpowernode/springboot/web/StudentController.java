package com.thbpowernode.springboot.web;

import com.thbpowernode.springboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @RequestMapping("/student")
    public Object student(Integer id,Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

    @GetMapping("/student/detail/{id}/{age}")
    public Object student1(@PathVariable("id") Integer id,
                           @PathVariable("age") Integer age){
        Map<String,Object> retMap = new HashMap<>();

        retMap.put("id",id);
        retMap.put("age",age);
        return retMap;
    }

    //@RequestMapping("/student/detail/{id}/{status}")
    @DeleteMapping("/student/detail/{id}/{status}")
    public Object student2(@PathVariable("id") Integer id,
                           @PathVariable("status") Integer status){
        Map<String,Object> retMap = new HashMap<>();

        retMap.put("id",id);
        retMap.put("status",status);
        return retMap;
    }

    //以上代码会出现请求代码模糊的错误
    //通常在RESTful风格中方法请求方式会按照增删改查的请求方式来区分
}
