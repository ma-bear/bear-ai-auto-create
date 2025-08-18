package com.mabear.bearaicodemother.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xq
 * @create 2025/8/15 17:40
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/test")
    public String healthCheck() {
        return "ok";
    }
}

