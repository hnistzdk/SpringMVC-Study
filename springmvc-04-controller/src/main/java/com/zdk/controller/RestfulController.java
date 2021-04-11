package com.zdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author zdk
 * @date 2021/4/11 13:26
 */
@Controller
public class RestfulController {

    //第二个参数可以限定通过指定的请求方式才能请求到,如果请求方法不一致，就会报405错误
    //a和b就是前端传来的参数的名字 要一致
    //原：http://localhost:8080/add?a=1&b=2
    //restful：在需要的那个参数前添加@PathVariable注解即可：http://localhost:8080/add/1/2

    //@RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET),与@GetMapping("/add/{a}/{b}")同

    @PostMapping ("/add")
    public String test1(int a, int b, Model model){
        int result=a+b;
        model.addAttribute("msg", "结果1为"+result);
        return "test";
    }
    @GetMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int result=a+b;
        model.addAttribute("msg", "结果2为"+result);
        return "test";
    }
}
