package com.paiv.projetoweb.controller;

import java.util.List;

import com.paiv.projetoweb.entity.Funcionario;
import com.paiv.projetoweb.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping("/main")
public class FunconarioController {
    
    @Autowired
    FuncionarioService funcionarioService;

    @GetMapping("/gestao")
    public ModelAndView gestao(){
        ModelAndView mv = new ModelAndView("gestao");
        mv.addObject("funcionarios",funcionarioService.getAllFuncionarios());
        return mv;
    }

    //TESTING
    @GetMapping("/inserefuncs")
    public String inserefuncs(){
        funcionarioService.insereListaFunc();
        return "redirect:/main/gestao";
    }
}
