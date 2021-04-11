package com.zdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zdk
 * @date 2021/4/11 14:41
 */
@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String test1(Model model){
        model.addAttribute("msg", "ModelTest1");
        //没配置视图解析器，需要全限定名,此种方式默认是转发 url不改变
        //return "/WEB-INF/jsp/test.jsp";
        //return "forward:/WEB-INF/jsp/test.jsp";
        return "redirect:/index.jsp";
    }
}
