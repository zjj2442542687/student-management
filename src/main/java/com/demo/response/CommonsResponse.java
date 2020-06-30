package com.demo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;


@ApiModel(value = "通用的返回类", description = "会携带返回数据")
@Getter
public class CommonsResponse<T> extends BaseResponse {
    @ApiModelProperty(value = "返回携带的数据")
    private final T data;

    public CommonsResponse(T data) {
        super(CommonsResponseEnum.SUCCESS);
        this.data = data;
    }

    public CommonsResponse(IResponse iResponse, T data) {
        super(iResponse);
        this.data = data;
    }
}
