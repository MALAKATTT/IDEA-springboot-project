package com.thbpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/say")
    public ModelAndView say(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Hello Springboot");
        mv.setViewName("say");
        return mv;
    }

    /*拆分以上写法*/
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message","HelloWorld");
        return "say";
    }
}
