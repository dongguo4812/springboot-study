package com.dongguo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author dongguo
 * @date 2023/6/13
 * @description:
 */
@Controller
public class WelcomeController {

    @GetMapping("hello")
    public String hello(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }
}
