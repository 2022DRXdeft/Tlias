package com.lyh.springboot01_2026711;

import com.lyh.springboot01_2026711.mapper.UserMapper;
import com.lyh.springboot01_2026711.pojo.User;
import com.lyh.springboot01_2026711.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot012026711ApplicationTests {

    @Autowired
    UserService userServiceImpl;

    @Autowired
    UserMapper userMapper;

    @Test
    public void test1(){
        User user = userServiceImpl.getById(1);


        System.out.println("用户信息为："+ user);

    }


}
