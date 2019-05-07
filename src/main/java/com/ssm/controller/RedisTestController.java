package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.CacheUtil;

@Controller
@RequestMapping("/redistest")
public class RedisTestController {

	   @RequestMapping("redis")
	    public String redisTest() {
		try {
		    boolean b = CacheUtil.setString("123", "redis");//向redis里存字符串 key-value
		    System.out.println(b);//true成功，
		    System.out.println(CacheUtil.getString("123"));//从radis里取数据 key
		} catch (Exception e) {
		    e.printStackTrace();
		    return null;
		}
		return "hello";
	    }

}
