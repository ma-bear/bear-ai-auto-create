package com.mabear.bearaicodemother.service.impl;

import jakarta.annotation.Resource;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author: ma bear
 * @date: 2025/8/26 11:39
 */
@SpringBootTest
class RedisHealthIndicatorTest {

    @Resource
    RedisHealthIndicator redisHealthIndicator;

    @Test
    void health() {
        val health = redisHealthIndicator.health();
        System.out.println(health);
    }
}