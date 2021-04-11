package com.zdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zdk
 * @date 2021/4/11 11:36
 */
//在类上加上@RequestMapping("/hello")后请求路径变为了localhost:8080/hello/h1

@Controller
//@RequestMapping("/hello")

public class HelloController {

    //请求的路径

    @RequestMapping("/h1")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg", "springMVC注解");

        //返回hello字符串会被视图解析器处理,转到对应name为hello的视图
        return "hello";
    }
}
