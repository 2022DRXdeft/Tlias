package com.itheima.service.Impl;

import com.itheima.mapper.DeptMapper;
import com.itheima.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import com.itheima.service.DeptService;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    /**
     * 查询所有部门
     * @return List<Dept>
     */
    @Override
    public List<Dept> getDeptList(){

        List<Dept> deptList = deptMapper.getDeptList();

        return deptList;
    }

    /**
     * 根据id删除部门
     * @param id
     * @return Integer
     */
    @Override
    public Integer DeleteDeptById(Integer id){

        return deptMapper.deleteDeptById(id);

    }

    /**
     * 添加部门
     * @param dept
     * @return  Integer
     */
    @Override
    public Integer AddDept(Dept dept) {

        //创建dpt对象的更新时间与创建时间
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        return deptMapper.addDept(dept);

    }


}
