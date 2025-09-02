package com.mabear.bearaicodemother;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BearAiCodeScreenshotApplication {
    public static void main(String[] args) {
        SpringApplication.run(BearAiCodeScreenshotApplication.class, args);
    }
}
