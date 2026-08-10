package com.lyh.springboot01_2026711;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyh.springboot01_2026711.mapper")
public class Springboot012026711Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot012026711Application.class, args);
    }

}