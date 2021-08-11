package com.thbpowernode.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexControllor {

    @RequestMapping(value = "/springboot/say")
    public @ResponseBody String say(){
        return "hello springboot!!!";
    }
}
