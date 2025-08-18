package com.mabear.bearaicodemother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class BearAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(BearAiCodeMotherApplication.class, args);
    }

}
