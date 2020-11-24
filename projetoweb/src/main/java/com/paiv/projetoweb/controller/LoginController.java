package com.paiv.projetoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @GetMapping("/entrar")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("login");//novo modelo e view com o nome da view
        return mv;
    }
}
