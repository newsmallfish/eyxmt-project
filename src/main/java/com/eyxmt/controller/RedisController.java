package com.eyxmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @RequestMapping("/redis")
    @ResponseBody
    public String redis(){

        stringRedisTemplate.opsForHash().put("fish","smallfish","汪承鲲");
        String string= (String) stringRedisTemplate.opsForHash().get("fish","smallfish");
        System.out.println(string);
        return "redis";
    }
}
