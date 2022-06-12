package com.wandou.bull.model.pojo;

/**
 * @author liming
 * @date 2021/12/23 16:12
 */
public class BaseResult<T> {
    private int code;
    private T data;

    public BaseResult() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
