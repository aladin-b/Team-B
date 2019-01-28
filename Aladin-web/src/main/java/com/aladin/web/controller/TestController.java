package com.aladin.web.controller;

import com.aladin.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author:GaoPan
 * @Date:2019/1/28 14:14
 * @Version 1.0
 **/
@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private UserService userService;

    @RequestMapping("/select")
    public @ResponseBody
    JSONObject select (){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("info",userService.select());
        return jsonObject;
    }
}
