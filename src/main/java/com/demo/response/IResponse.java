package com.demo.response;



public interface IResponse {
    /**
     * 返回状态码
     * @return 返回状态码
     */
    int getCode();

    /**
     * 返回信息
     * @return 返回信息
     */
    String getMessage();
}
