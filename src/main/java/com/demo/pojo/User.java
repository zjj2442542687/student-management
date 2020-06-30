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
    @ApiModelProperty(value = "用户名", example = "张三", required = true, name = "userName")
    private String userName;
    @ApiModelProperty(value = "密码", required = true, name = "password")
    private String password;
    @ApiModelProperty(value = "手机号", required = true, name = "phoneNumber")
    private String phoneNumber;

//    public User(String userName, String password, String phoneNumber) {
//        this.userName = userName;
//        this.password = password;
//        this.phoneNumber = phoneNumber;
//    }
}
