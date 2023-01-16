package com.example.springboot3dubbo3;

/**
 * @author daixiaodong
 * @date 2023/1/16
 */
public class Response {

    boolean isSuccess;

    String name;

    public Response(boolean isSuccess, String name) {
        this.isSuccess = isSuccess;
        this.name = name;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
