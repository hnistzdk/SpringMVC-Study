package com.zdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author zdk
 * @date 2021/4/11 15:36
 */
@Controller
public class EncodingController {

    @PostMapping("/e/t1")
    public String test1(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg", name);
        return "test";
    }
}
