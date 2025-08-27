package com.mabear.bearaicodemother.langgraph4j.tools;

import com.mabear.bearaicodemother.langgraph4j.model.ImageCategoryEnum;
import com.mabear.bearaicodemother.langgraph4j.model.ImageResource;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *
 * @author: ma bear
 * @date: 2025/8/27 22:03
 */
@SpringBootTest
class LogoGeneratorToolTest {

    @Resource
    private LogoGeneratorTool logoGeneratorTool;

    @Test
    void testGenerateLogos() {
        // 测试生成Logo
        List<ImageResource> logos = logoGeneratorTool.generateLogos("技术公司现代简约风格Logo");
        assertNotNull(logos);
        ImageResource firstLogo = logos.getFirst();
        assertEquals(ImageCategoryEnum.LOGO, firstLogo.getCategory());
        assertNotNull(firstLogo.getDescription());
        assertNotNull(firstLogo.getUrl());
        logos.forEach(logo ->
                System.out.println("Logo: " + logo.getDescription() + " - " + logo.getUrl())
        );
    }
}
