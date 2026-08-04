package com.lyh.springboot01_2026711;

import com.lyh.springboot01_2026711.mapper.UserMapper;
import com.lyh.springboot01_2026711.pojo.User_Mybatis;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot012026711ApplicationTests {

    @Autowired
    UserMapper userMapper;

//    @Test
//    public void userTest() {
//        System.out.println("userTest");
//
//        List<User_Mybatis> all = userMapper.findAll();
//        all.forEach(user -> System.out.println(user));
//
//    }

//    @Test
//    public void deleteById() {
//        System.out.println("deleteById");
//
//        Integer i = userMapper.deleteById(11);
//        System.out.println("删除了"+i+"行数据");
//    }

//    @Test
//    public void insert(){
//        User_Mybatis userMybatis = new User_Mybatis(null,"lyh", "123456", "lyh", 18);
//        Integer insert = userMapper.insert(userMybatis);
//        System.out.println("新插入的对象id为："+ userMybatis.getId());
//
//    }



//    @Test
//    public void update(){
//        User_Mybatis userMybatis = new User_Mybatis(12,"lyh111", "123456", "lyh", 18);
//        Integer update = userMapper.update(userMybatis);
//        System.out.println("更新了"+update+"行数据");
//    }

    @Test
    public void findUser(){
        User_Mybatis userMybatis = new User_Mybatis();
        User_Mybatis lyh = userMapper.findByUsernameAndPassword("lyh111", "123456");

        System.out.println(lyh);
    }




}
