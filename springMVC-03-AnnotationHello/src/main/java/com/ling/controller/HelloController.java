package com.ling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//注册到spring中
@Controller
//访问地址，被指定为Controller

public class HelloController {
    @RequestMapping("/h1")
    //此时的访问地址为 项目/HelloController/h1
    // “/”的目的是表明这是一个相对地址
    public String sayHello(Model model){
//        适配器调用Controller，Controller就能将model注入到当前方法中了
        model.addAttribute("msg","hello world");
        //返回到的jsp页面，springmvc帮助完成地址拼接
        // WBE_INF/jsp/hello.jsp
        return "hello";
    }
    @RequestMapping("/h2")
    public  String sayWorld(Model model){
        model.addAttribute("msg","world");
        return "hello";
    }
}
