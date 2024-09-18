package com.ling.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilterController {
    @RequestMapping("/hello")
    public String getHello(Model model){
        model.addAttribute("msg","adad" );
        return "admin";
    }
    @RequestMapping("/filter")
    public String getFilter(){
        return "filter";
    }
    @RequestMapping("/filter2")
    public String getFilter2(Model model,String name){
        model.addAttribute("msg",name);
        return "admin";
    }
}
