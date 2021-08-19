package com.zdk.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author com.zdk
 * @date 2021/4/11 17:15
 */
public class JsonUtils {
    public static String getJson(Object object) throws JsonProcessingException {
        return getJson(object, "yyyy-MM-dd");
    }
    public static String getJson(Object object,String sdf) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sdf);
        mapper.setDateFormat(simpleDateFormat);
        return mapper.writeValueAsString(object);
    }
}
