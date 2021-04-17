package com.zdk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zdk
 * @date 2021/4/17 11:29
 */

@RestController
public class TestController {
    @RequestMapping("/t1")
    public String test(){
        System.out.println("TestController==> test()执行了");
        return "OK";
    }
}
