package com.itheima.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private Integer code; //状态码 1:成功 0:失败
    private String msg; //返回信息
    private Object data; //数据

    public static Result success(){

        return  new Result(1,"success",null);

    }


    public static Result success(Object data){

        return  new Result(1,"success",data);

    }

    public static Result success(String msg){

        return  new Result(1,msg,null);

    }

    public static Result error(String msg){

        return  new Result(0,msg,null);

    }

    public static Result error(){

        return  new Result(0,"error",null);

    }
}
