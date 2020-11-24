package com.paiv.projetoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CadastrarController {
    @GetMapping("/cadastrar")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("register");//novo modelo e view com o nome da view
        return mv;
    }
}
