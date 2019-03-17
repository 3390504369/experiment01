package com.example.experiment01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//声明此类为springboot的配置类，自动扫描到的次类，按配置类加载，通过
//run()静态方法，基于配置类启动springboot，即，基于次类的配置，启动
public class Experiment01Application {

    public static void main(String[] args) {
        SpringApplication.run(Experiment01Application.class, args);
    }

}
