package com.zdk.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zdk.pojo.User;
import com.zdk.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author com.zdk
 * @date 2021/4/11 16:40
 */
//@Controller
//在类上增加@RestController,类中所有的方法都只会返回json字符串,不用在每个方法上都加@ResponseBody了
@RestController

public class UserController {
    //增加此注解,方法就不会走视图解析器,会直接返回字符串

    //@ResponseBody
    //原生的解决返回json时出现中文乱码的方式:@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")

    @RequestMapping(value = "/j1")
    public String json1() throws JsonProcessingException {
        User user = new User(5,"张迪凯",20);
        //jackson ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        String str=mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping(value = "/j2")
    public String json2() throws JsonProcessingException {
        User user1 = new User(5,"张迪凯",20);
        User user2 = new User(5,"张迪凯",20);
        User user3 = new User(5,"张迪凯",20);
        User user4 = new User(5,"张迪凯",20);
        List<User> list=new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return JsonUtils.getJson(list);
    }

    @RequestMapping(value = "/j3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        //ObjectMapper mapper = new ObjectMapper();
        //转换时间格式方法1:传统Java方式
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
        //return mapper.writeValueAsString(simpleDateFormat.format(date));

        //方式2:使用ObjectMapper对象,关闭默认生成时间戳格式的Date
        //mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //mapper.setDateFormat(simpleDateFormat);
        return JsonUtils.getJson(date);

        //ObjectMapper解析Date后默认格式为Timestamp,时间戳
        //return mapper.writeValueAsString(date);
    }

    //fastjson示例

    @RequestMapping(value = "/j4")
    public String json4() throws JsonProcessingException {
        User user1 = new User(1,"张迪凯",20);
        User user2 = new User(2,"张迪凯",20);
        User user3 = new User(3,"张迪凯",20);
        User user4 = new User(4,"张迪凯",20);
        List<User> list=new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return JSON.toJSONString(list);
    }
}
