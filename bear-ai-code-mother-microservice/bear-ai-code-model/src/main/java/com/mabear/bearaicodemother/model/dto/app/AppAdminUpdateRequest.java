package com.mabear.bearaicodemother.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xq
 * @create 2025/8/21 18:23
 */
@Data
public class AppAdminUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 应用封面
     */
    private String cover;

    /**
     * 优先级
     */
    private Integer priority;

    private static final long serialVersionUID = 1L;
}

