package com.zdk.controller;

import com.zdk.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zdk
 * @date 2021/4/17 11:29
 */

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }
    @RequestMapping("/a1")
    public String a1(String name){

        return "hello";
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> userList=new ArrayList<>();
        userList.add(new User("张三",10,"男"));
        userList.add(new User("李四",20,"男"));
        userList.add(new User("王五",30,"男"));
        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String username,String password){
        String msg="";
        if(username!=null){
            if("admin".equals(username)){
                msg="ok";
            }else {
                msg="用户名有误";
            }
        }
        if(password!=null){
            if("123".equals(password)){
                msg="ok";
            }else {
                msg="密码有误";
            }
        }
        return msg;
    }
}
