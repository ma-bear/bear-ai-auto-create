package com.mabear.bearaicodemother.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xq
 * @create 2025/8/22 13:23
 */
@Data
public class AppDeployRequest implements Serializable {

    /**
     * 应用 id
     */
    private Long appId;

    private static final long serialVersionUID = 1L;
}

