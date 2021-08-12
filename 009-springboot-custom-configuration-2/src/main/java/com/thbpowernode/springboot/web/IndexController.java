package com.thbpowernode.springboot.web;

import com.thbpowernode.springboot.config.Baidu;
import com.thbpowernode.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private School school;

    @Autowired
    private Baidu baidu;

    @RequestMapping(value = "/say")
    public @ResponseBody String say(){

        String schoolinfo = "学校名称=" + school.getName() + "-----学校网址=" + school.getWebsit();
        String baiduinfo = "百度名称=" + baidu.getName() + "------百度网址=" + baidu.getWebsit();

        return schoolinfo + baiduinfo;
    }

}
