package com.ccfond.webchat.api.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author chea0515@163.com
 */

@Getter
@Setter
public class BaseResult<T> implements Serializable {

    private String code;
    private String msg;
    private T data;

    public BaseResult() {
    }

    public BaseResult(String code, String msg) {
        this(code, msg, null);
    }

    public BaseResult(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <R> BaseResult<R> result(R data) {
        return new BaseResult<>(BaseCode.SUCCESS_CODE, "操作成功", data);
    }

    public static <R> BaseResult<R> successResult() {
        return new BaseResult<>(BaseCode.SUCCESS_CODE, "操作成功");
    }

    public static <R> BaseResult<R> failResult() {
        return new BaseResult<>(BaseCode.FAIL_CODE, "操作失败");
    }
}
