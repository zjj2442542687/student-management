package com.cuberxp.springmvcdemo5.commons.enums;

/**
 * @author cuberxp
 * Create time 2020/5/26 19:03
 * @since 1.0.0
 */
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
