package com.mabear.bearaicodeuser;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.mabear.bearaicodeuser.mapper")
@ComponentScan("com.mabear")
@EnableDubbo
public class BearAiCodeUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(BearAiCodeUserApplication.class, args);
    }
}
