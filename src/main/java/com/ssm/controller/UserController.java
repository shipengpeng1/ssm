package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    
    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    
    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(User user,Model model){
    	System.out.println(user.getUsername()+"***"+user.getPassword());
        //调用service方法
      user = userService.login(user.getUsername(), user.getPassword());
        //若有user则添加到model里并且跳转到成功页面
        if(user != null){
            model.addAttribute("user",user);
            return "loginsucc";
        }
        return "fail";
    }


}
