package com.lyh.springboot01_2026711.mapper;

import com.lyh.springboot01_2026711.pojo.User_Mybatis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User_Mybatis> findAll();

    // 可以是void , 如果是Integer的话代表的是删除的行数
    Integer deleteById(Integer id);

    Integer insert(User_Mybatis user);

    Integer update(User_Mybatis user);



    // @Param 注解用于指定 SQL 中 #{...} 占位符对应的参数名称。
    // 当方法有多个参数时，MyBatis 无法自动按名称匹配，需要通过 @Param 显式绑定：
    //   - @Param("username") 对应 XML 中的 #{username}
    //   - @Param("password") 对应 XML 中的 #{password}
    // 如果只有一个参数，可以不加 @Param，MyBatis 会自动识别；但多个参数时必须加，
    // 否则 MyBatis 会抛出 BindingException。
    // 另外，加了 @Param 后方法体内部需要用参数名引用，而不是 arg0/param1 这种默认名称。
    User_Mybatis findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);




}
