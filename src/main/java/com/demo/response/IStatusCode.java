package com.demo.response;

import io.swagger.annotations.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ：dyx
 * @date :  2020/7/1 2:22
 * description ： 存放一些状态码的常量
 * version : 1.0
 */
public interface IStatusCode {
    // 状态码的常量值
    int SUCCESS_CODE = 200;
    String SUCCESS_MESSAGE = "成功";

    int FAIL_CODE = 502;
    String FAIL_MESSAGE = "失败";

    int NOT_AUTHORITY_CODE = 401;
    String NOT_AUTHORITY_MESSAGE = "没有权限";

    // 状态码的枚举类
    CommonsResponseEnum SUCCESS = CommonsResponseEnum.SUCCESS;
    CommonsResponseEnum FAIL = CommonsResponseEnum.FAIL;
    CommonsResponseEnum NOT_AUTHORITY = CommonsResponseEnum.NOT_AUTHORITY;

    int getCode();
    String getMessage();

    @Getter
    @AllArgsConstructor
    enum CommonsResponseEnum implements IStatusCode {
        /**
         * 通用的json 枚举常量值
         */
        // 成功
        SUCCESS(IStatusCode.SUCCESS_CODE, IStatusCode.SUCCESS_MESSAGE),
        // 失败
        FAIL(IStatusCode.FAIL_CODE, IStatusCode.FAIL_MESSAGE),
        // 没有权限
        NOT_AUTHORITY(IStatusCode.NOT_AUTHORITY_CODE, IStatusCode.NOT_AUTHORITY_MESSAGE)
        ;

        private int code;

        private String message;
    }
}
