package com.mabear.bearaicodemother;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.mabear.bearaicodemother.mapper")
@EnableCaching
public class BearAiCodeAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(BearAiCodeAppApplication.class, args);
    }
}
