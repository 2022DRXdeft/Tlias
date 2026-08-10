package com.lyh.springboot01_2026711.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.springboot01_2026711.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
