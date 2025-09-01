package com.mabear.bearaicodemother.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xq
 * @create 2025/8/21 17:32
 */
@Data
public class AppAddRequest implements Serializable {

    /**
     * 应用初始化的 prompt
     */
    private String initPrompt;

    private static final long serialVersionUID = 1L;
}

