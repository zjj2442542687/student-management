package com.demo.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@ApiModel("用户")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("手机号")
    private String phoneNumber;
}
