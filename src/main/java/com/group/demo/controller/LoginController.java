package com.group.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* 登录控制 */
@Controller
public class LoginController {

    //1.首先进入主页
    @RequestMapping(path = "/", method = RequestMethod.GET) //转发到注册页面（字符串为模板名）
    public String getRegisterPage() {
        return "/index";
    }


}
