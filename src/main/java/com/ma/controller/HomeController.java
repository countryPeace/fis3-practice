package com.ma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页相关的controller
 * Created by Magp on 2016/7/15.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("")
    public String goHome(){
        return "home/home";
    }
}
