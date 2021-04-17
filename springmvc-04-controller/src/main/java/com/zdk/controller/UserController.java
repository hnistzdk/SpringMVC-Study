package com.zdk.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.zdk.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author com.zdk
 * @date 2021/4/11 15:03
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //localhost:8080/user/t1?name=xxx;

    @GetMapping("t1")
    public String test1(@RequestParam("username") String name, Model model){
        //1. 接收前端参数
        System.out.println("前端传来的参数为："+name);
        //2. 将返回的结果传递给前端
        model.addAttribute("msg", name);
        //3. 跳转视图
        return "test";
    }

    //接收的是一个对象:id,name,age
    //localhost:8080/user/t1?id=5&name=xxx&age=5
    /**
    *   1．接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
     *   User(id=5, name=xxx, age=5)
    *   2．假设传递的是一个对象User，匹配User对象中的字段名;如果名字一致则oK，否则,匹配失败
     *   User(id=5, name=null, age=5)(传的是username)
    */
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }
}
