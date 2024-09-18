package com.ling.controller;

import com.ling.pojo.User;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
    @RequestMapping("/Json")
    @ResponseBody
    public  String getJson(){
        User user = new User("zhangSan","21","female");
        return user.toString();
    }
    @RequestMapping("/json")
    public  String getJson(Model model){
        model.addAttribute("msg","dawda");
        return "json";
    }
}
