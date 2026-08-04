package com.itheima.controller;


import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/depts")
public class DeptController {

    @Autowired
    DeptService deptService;

    /**
     * 查询所有部门信息
     * @return  Result
     */
    @GetMapping
    public Result DeptList(){

        List<Dept> list = deptService.getDeptList();


        return Result.success(list);
    }

    /**
     * 删除部门
     * @param id
     * @return Result
     */
    @DeleteMapping
    public Result DeleteDeptById(@RequestParam(value = "id", required = true) Integer id){


        // 调用service方法 删除部门
        Integer i = deptService.DeleteDeptById(id);

        if (i == 0){
            return Result.error("删除失败");
        }else if (i == 1){
            return Result.success("删除成功");
        }



        return Result.error();
    }


    /**
     * 添加部门
     * @param dept
     * @return Result
     */
    @PostMapping
    public Result AddDept(@RequestBody Dept dept){

        Integer changeNumer =  deptService.AddDept(dept);

        if (changeNumer == 0){
            return Result.error("添加失败");
        }

        return Result.success("添加成功");
    }


}
