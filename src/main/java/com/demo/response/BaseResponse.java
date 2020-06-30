package com.cuberxp.springmvcdemo5.commons.response;

import com.cuberxp.springmvcdemo5.commons.enums.CommonsResponseEnum;
import com.cuberxp.springmvcdemo5.commons.enums.IResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * @author cuberxp
 * @since 1.0.0
 * Create time 2020/5/26 18:59
 */
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
        this.code = CommonsResponseEnum.SUCCESS.getCode();
        this.message = CommonsResponseEnum.SUCCESS.getMessage();
    }

    public BaseResponse(IResponse iResponse) {
        this.code = iResponse.getCode();
        this.message = iResponse.getMessage();
    }
}
