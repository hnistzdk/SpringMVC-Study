package com.zdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zdk
 * @date 2021/4/11 13:02
 */
//@Controller注解的类代表这个类会被spring托管
//这个类中的所有方法，如果返回值是String类型，并且有对应的页面可以跳转，就会被视图解析器解析


@Controller
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg", "ControllerTest2");
        return "test";
    }
}
