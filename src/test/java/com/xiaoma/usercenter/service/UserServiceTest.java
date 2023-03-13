package com.xiaoma.usercenter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 * 小马
 */
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

//    @Test
//    void UserServiceTest() {
//        Pattern pattern = Pattern.compile("java");
//        String abc = "123java456";
//        String[] abcs = pattern.split(abc);
//        for (String s : abcs) {
//            System.out.println(s);
//        }
//
//
//    }

    @Test
    void userRegister() {
        String userAccount = "LaoMa";
        String userPassword = "";
        String checkPassword = "123456";
        String planetCode = "1";
        System.out.println("测试账号密码！！！");
        long result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1, result);

        System.out.println("单独测试账号");
        userAccount = "Lao";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1, result);

        System.out.println("测试账号密码");
        userAccount = "LaoMa";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1, result);

        System.out.println("二代测试账号密码");
        userAccount = "Lao Ma";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1, result);


        System.out.println("测试验证密码");
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1, result);

        System.out.println("测试账号验证密码");
        userAccount = "dogLaoMa";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1, result);


        System.out.println("测试账号是否存在");
        userAccount="LaoMa";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
//        Assertions.assertTrue(result > 0);
        Assertions.assertEquals(-1, result);
    }
}