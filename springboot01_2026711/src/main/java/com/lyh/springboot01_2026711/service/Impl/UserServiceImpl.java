package com.lyh.springboot01_2026711.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyh.springboot01_2026711.mapper.UserMapper;
import com.lyh.springboot01_2026711.pojo.User;
import com.lyh.springboot01_2026711.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
