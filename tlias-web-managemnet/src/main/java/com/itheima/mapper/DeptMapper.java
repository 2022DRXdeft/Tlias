package com.itheima.mapper;


import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    /**
     * 查询所有部门
     * @return List<Dept>
     */
    List<Dept> getDeptList();

    /**
     * 根据id删除部门
     * @param id
     */
    Integer deleteDeptById(Integer id);


    Integer addDept(Dept dept);
}
