package com.demo.controller;

import com.demo.pojo.User;
import com.demo.response.CommonsResponse;
import com.demo.response.CommonsResponseEnum;
import com.demo.response.CustomResponse;
import com.demo.response.IResponse;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.val;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/smsLogin")
    @ApiResponses({
            @ApiResponse(code = 1000, message = "非HTTP状态码，返回值JSON code字段值，描述：成功"),
            @ApiResponse(code = 401, message = "非HTTP状态码，返回值JSON code字段值，描述：无token")
    })
    public CommonsResponse<User> login(@ApiParam("手机号")@RequestParam("phoneNumber") String phoneNumber,
                                       @ApiParam("code")@RequestParam("code")String code) {
        return new CommonsResponse<>(new User("张三", "123", "110"));
    }

    @PostMapping("/passwordLogin")
    @ApiResponses({
            @ApiResponse(code = 1000, message = "非HTTP状态码，返回值JSON code字段值，描述：成功"),
            @ApiResponse(code = 401, message = "非HTTP状态码，返回值JSON code字段值，描述：无token")
    })
    public CommonsResponse<User> passwordLogin(@ApiParam("用户名")@RequestParam("userName") String userName,
                                               @ApiParam("密码")@RequestParam("password") String password) {
        // CommonsResponseEnum(int, java.lang.String)' has private access in 'com.demo.response.CommonsResponseEnum
        return new CommonsResponse<>(
//                new CustomResponse(200, "SUCCESS"),
                new User(userName, password, "")
        );
    }
}
