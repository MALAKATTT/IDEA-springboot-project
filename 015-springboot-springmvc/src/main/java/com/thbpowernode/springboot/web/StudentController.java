package com.thbpowernode.springboot.web;

import com.thbpowernode.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
//这个注解相当于当前控制层类上加@Controller + 方法上加@Responsebody
//意味着当前控制层类中所有的方法返还的都是JSON对象
public class StudentController {

    @RequestMapping("/student")
    public /*@ResponseBody*/ Object student(){
        Student student = new Student();
        student.setId(10001);
        student.setName("zhangsan");
        return student;
    }

    //该方法默认GET和POST请求方式都支持
    @RequestMapping(value = "/queryStudentById",method = {RequestMethod.GET,RequestMethod.POST})
    public Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;
    }

    //@RequestMapping(value = "queryStudentById2",method = RequestMethod.GET)
    @GetMapping("/queryStudentById2")//等同于上方注解效果，只使用GET方法 ---->一般用于数据查询
    public Object queryStudentById2(){
        return "Only GET Method";
    }

    //@RequestMapping(value = "queryStudentById2",method = RequestMethod.POST)
    @PostMapping("/insert")//等同于上方注解效果，只使用POST方式 ----> 一般用于数据新增
    public Object insert(){
        return "insert Only POST Method";
    }

    //@RequestMapping(value = "queryStudentById2",method = RequestMethod.DELETE)
    @DeleteMapping("/delete")//等同于上方注解效果，只使用Delete方式 ----> 一般用于数据删除
    public Object delete(){
        return "delete Only DELETE Method";
    }

    //更新没有明确规定，可以选择put请求方式
    //@RequestMapping(value = "queryStudentById2",method = RequestMethod.PUT)
    @PutMapping("put")
    public Object update(){
        return "update Only PUT Method";
    }

    /*
        结论：工作中没有请求方式明确要求时，以GET和POST方法居多
     */
}
