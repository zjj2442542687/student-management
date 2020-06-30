package com.cuberxp.springmvcdemo5.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author cuberxp
 * Create time 2020/5/26 19:02
 * @since 1.0.0
 */
@Getter
@AllArgsConstructor
public enum CommonsResponseEnum implements IResponse {
    /**
     * 通用的json 枚举常量值
     */
    SUCCESS(200, "success"),
    FAIL(502, "fail"),
    NOT_AUTHORITY(401, "没有该权限")
    ;

    private int code;

    private String message;
}
