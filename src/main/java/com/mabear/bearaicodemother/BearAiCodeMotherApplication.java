package com.mabear.bearaicodemother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@MapperScan("com.mabear.bearaicodemother.mapper")
public class BearAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(BearAiCodeMotherApplication.class, args);
    }

}
