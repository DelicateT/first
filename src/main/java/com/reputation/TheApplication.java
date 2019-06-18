package com.reputation;

/*
    * springboot引导类
    *
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheApplication {

    public static void main(String[] args) {
        //运行起步类（main方法），会自动启动内置的tomcat服务器，方便开发。
        SpringApplication.run(TheApplication.class,args);
    }
}
