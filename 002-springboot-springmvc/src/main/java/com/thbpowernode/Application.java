package com.thbpowernode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//开启springboot配置
public class Application {

    //springboot项目的代码必须放在Application同级目录或者下级目录里面

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
