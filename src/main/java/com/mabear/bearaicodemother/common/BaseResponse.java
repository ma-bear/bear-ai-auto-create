package com.mabear.bearaicodemother.common;

import com.mabear.bearaicodemother.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @author xq
 * @create 2025/8/18 15:42
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

