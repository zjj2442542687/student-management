package com.demo.controller;

import com.demo.pojo.User;
import com.demo.response.CommonsResponse;
import com.demo.response.IStatusCode;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"用户操作接口"})
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "短信登录", notes = "注意都不能为空")
    @PostMapping("/smsLogin")
    @ApiResponses({
            @ApiResponse(code = IStatusCode.SUCCESS_CODE, message = IStatusCode.SUCCESS_MESSAGE),
            @ApiResponse(code = IStatusCode.FAIL_CODE, message = IStatusCode.FAIL_MESSAGE),
            @ApiResponse(code = IStatusCode.NOT_AUTHORITY_CODE, message = IStatusCode.NOT_AUTHORITY_MESSAGE)
    })
    public CommonsResponse<User> login(@ApiParam("手机号")@RequestParam("phoneNumber") String phoneNumber,
                                       @ApiParam("code")@RequestParam("code")String code) {
        return new CommonsResponse<>(new User("张三", "123", "110"));
    }

    @ApiOperation("密码登录")
    @PostMapping("/passwordLogin")
    @ApiResponses({
            @ApiResponse(code = IStatusCode.SUCCESS_CODE, message = IStatusCode.SUCCESS_MESSAGE),
            @ApiResponse(code = IStatusCode.FAIL_CODE, message = IStatusCode.FAIL_MESSAGE),
            @ApiResponse(code = IStatusCode.NOT_AUTHORITY_CODE, message = IStatusCode.NOT_AUTHORITY_MESSAGE)
    })
    public CommonsResponse<User> passwordLogin(@ApiParam("用户名")@RequestParam("userName") String userName,
                                               @ApiParam("密码")@RequestParam("password") String password) {
        // CommonsResponseEnum(int, java.lang.String)' has private access in 'com.demo.response.CommonsResponseEnum
        return new CommonsResponse<>(
//                new CustomResponse(200, "SUCCESS"),
                new User(userName, password, "")
        );
    }

    @ApiOperation("注册")
    @PostMapping("/register")
    @ApiResponses({
            @ApiResponse(code = IStatusCode.SUCCESS_CODE, message = IStatusCode.SUCCESS_MESSAGE),
            @ApiResponse(code = IStatusCode.FAIL_CODE, message = IStatusCode.FAIL_MESSAGE),
            @ApiResponse(code = IStatusCode.NOT_AUTHORITY_CODE, message = IStatusCode.NOT_AUTHORITY_MESSAGE)
    })
    public CommonsResponse<User> register(@ApiParam("用户名")@RequestParam("userName") String userName,
                                               @ApiParam("密码")@RequestParam("password") String password) {

        return new CommonsResponse<>(
                new User(userName, password, "")
        );
    }

    @ApiOperation("测试的接口")
    @PostMapping("/cs")
    @ApiResponses({
            @ApiResponse(code = IStatusCode.SUCCESS_CODE, message = IStatusCode.SUCCESS_MESSAGE),
            @ApiResponse(code = IStatusCode.FAIL_CODE, message = IStatusCode.FAIL_MESSAGE),
            @ApiResponse(code = IStatusCode.NOT_AUTHORITY_CODE, message = IStatusCode.NOT_AUTHORITY_MESSAGE)
    })
    public String cs(String name, String id, String t) {
        // CommonsResponseEnum(int, java.lang.String)' has private access in 'com.demo.response.CommonsResponseEnum

        return name + "   " + id;
    }

    @ApiOperation("查询测试")
    @GetMapping("select")
    //@ApiImplicitParam(name="name",value="用户名",dataType="String", paramType = "query")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name",value="用户名",dataType="String", paramType = "query",example="xingguo"),
            @ApiImplicitParam(name="id",value="用户id",dataType="int", paramType = "query", example = "1")
    })
    public void select(@RequestParam("name")String name, @RequestParam("id")int id){
        System.out.println(name);
        System.out.println(id);
    }
}
