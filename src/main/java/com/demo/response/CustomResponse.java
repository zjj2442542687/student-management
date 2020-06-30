package com.demo.response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

/**
 * @author ：dyx
 * @date :  2020/6/30 19:16
 * description ： 自定义写入状态码和信息
 * version : 1.0
 */
@Data
@ApiModel("状态信息")
@AllArgsConstructor
public class CustomResponse implements IStatusCode{
    @ApiModelProperty("状态码")
    private int code;
    @ApiModelProperty("信息")
    private String message;

}
