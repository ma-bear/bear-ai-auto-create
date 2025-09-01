package com.mabear.bearaicodemother.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xq
 * @create 2025/8/21 17:53
 */
@Data
public class AppUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 应用名称
     */
    private String appName;

    private static final long serialVersionUID = 1L;
}

