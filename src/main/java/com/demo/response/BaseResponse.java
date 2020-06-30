package com.demo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;


@ApiModel(value = "基本的返回类", description = "不携带返回数据")
@Getter
public class BaseResponse {
    @ApiModelProperty(value = "返回的状态码")
    protected Integer code;

    /**
     * success or fail
     */
    @ApiModelProperty(value = "返回信息")
    protected String message;

    public BaseResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse() {
        this.code = IStatusCode.CommonsResponseEnum.SUCCESS.getCode();
        this.message = IStatusCode.CommonsResponseEnum.SUCCESS.getMessage();
    }

    public BaseResponse(IStatusCode iResponse) {
        this.code = iResponse.getCode();
        this.message = iResponse.getMessage();
    }
}
