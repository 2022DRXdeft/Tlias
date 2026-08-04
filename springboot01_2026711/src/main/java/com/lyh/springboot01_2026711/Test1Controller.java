package com.lyh.springboot01_2026711;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")

public class Test1Controller {

    @GetMapping("/hello/{id}/{name}")
    public String hello(@PathVariable long id, @PathVariable String name) {
        System.out.println("hello " + id + name);

        return "hello " +id + " " + name;
    }

    @GetMapping("/hello2")
    public String hello2(HttpServletRequest request) {

        String name = request.getParameter("name");

        String uri = request.getRequestURI();

        String string = request.getRequestURI().toString();

        String header = request.getHeader("User-Agent");

        String method = request.getMethod();

        String queryString = request.getQueryString();


        System.out.println("name: " + name);
        System.out.println("uri: " + uri);
        System.out.println("string: " + string);
        System.out.println("header: " + header);
        System.out.println("method: " + method);
        System.out.println("queryString: " + queryString);

        return "request success";
    }

}
