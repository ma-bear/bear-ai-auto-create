package com.mabear.bearaicodemother.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xq
 * @create 2025/8/18 15:51
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}

