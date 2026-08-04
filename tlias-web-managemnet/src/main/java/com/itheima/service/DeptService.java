package com.itheima.service;

import com.itheima.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> getDeptList();

    Integer DeleteDeptById(Integer id);

    Integer AddDept(Dept dept);
}
