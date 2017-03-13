package com.edu.nju.wel.controller;

import com.edu.nju.wel.domain.Message;
import com.edu.nju.wel.domain.User;
import com.edu.nju.wel.service.UserAuthorizeService;
import com.edu.nju.wel.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by YU Fan on 2017/3/11.
 */
@Controller
@RequestMapping("/logic/user")
public class UserController {
    @Autowired
    private UserInfoService userService;
    @Autowired
    private UserAuthorizeService userAuthorizeService;

    @RequestMapping(value="/login" , method= RequestMethod.POST)
    public Message login(@RequestParam("id") String id,@RequestParam("password") String password){
        Message message = new Message();
        if(StringUtils.isEmpty(id)){
            message.setMsg("id不能为空");
            message.setResult("fail");
            return message;
        }
        boolean result=userAuthorizeService.authorize(id,password);
        if(result) {
            message.setMsg("登录成功");
            message.setResult("success");
            message.setData(id);
            return message;
        }
        else
        {
            message.setMsg("密码错误");
            message.setResult("fail");
            return message;
        }
    }

    @RequestMapping(value="/signup" , method=RequestMethod.POST)
    public Message signup(@RequestParam("id") String id,@RequestParam("password") String password){
        Message message = new Message();
        if(StringUtils.isEmpty(id)){
            message.setMsg("id不能为空");
            message.setResult("fail");
            return message;
        }
        boolean result=userAuthorizeService.signup(id);
        if(!result) {
            message.setMsg("用户名已存在");
            message.setResult("fail");
            return message;
        }
        else
        {
            message.setMsg("注册成功");
            message.setResult("success");
            return message;
        }
    }

    @RequestMapping(value="/query" , method=RequestMethod.POST)
    public Message userinfo_query(@RequestParam("id") String id){
        Message message = new Message();
        if(StringUtils.isEmpty(id)){
            message.setMsg("id不能为空");
            message.setResult("fail");
            return message;
        }
        User user=userService.findById(id);
        message.setResult("success");
        message.setData(user);
        return message;
    }
}
