package com.mabear.bearaicodemother.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author: ma bear
 * @date: 2025/8/26 11:35
 */
@Component
public class RedisHealthIndicator implements HealthIndicator {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public Health health() {
        try {
            // 执行简单的ping操作
            String result = (String) redisTemplate.getConnectionFactory()
                    .getConnection().ping();
            return Health.up().withDetail("redis", "Available").build();
        } catch (Exception e) {
            return Health.down()
                    .withDetail("redis", "Unavailable")
                    .withException(e)
                    .build();
        }
    }
}

