package com.demo.response;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum CommonsResponseEnum implements IResponse {
    /**
     * 通用的json 枚举常量值
     */
    SUCCESS(200, "SUCCESS"),
    FAIL(502, "fail"),
    NOT_AUTHORITY(401, "没有该权限")
    ;

    private int code;

    private String message;

}
