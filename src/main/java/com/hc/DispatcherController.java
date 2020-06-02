package com.hc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispatcherController {

    @RequestMapping("/demo")
    public String demo(){
        return "demo";
    }
    @RequestMapping("/demo2")
    public String demo2(){
        return "demo2";
    }

}
