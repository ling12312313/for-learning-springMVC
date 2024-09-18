package com.ling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping("/index/{a}/{b}")
    public String getIndex(Model model,@PathVariable int a,@PathVariable int b){
          model.addAttribute("msg","get"+a*b);
          return "redirect:/admin.jsp";
    }
    @PostMapping("/index/{a}/{b}")
    public String getIndex2(Model model,@PathVariable int a,@PathVariable int b){
        model.addAttribute("msg","post"+a*b);
        return "admin";
    }
    @RequestMapping("/hello")
    public String getHello(Model model,String name){
        model.addAttribute("msg",name);
        return "admin";
    }
}
