package com.lyh.springboot01_2026711.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_Mybatis {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;

}
