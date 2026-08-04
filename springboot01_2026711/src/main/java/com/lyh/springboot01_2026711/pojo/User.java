package com.lyh.springboot01_2026711.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private LocalDateTime updateTime;
}
