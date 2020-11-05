package com.paiv.projetoweb.controller;

import com.paiv.projetoweb.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping("/")
public class GestaoController {
    
    @Autowired
    FuncionarioService funcionarioService;

    //Retorna View Principal de gestão
    @GetMapping("gestao")
    public ModelAndView gestao(){
        ModelAndView mv = new ModelAndView("gestao");//novo modelo e view com o nome da view
        mv.addObject("funcionarios",funcionarioService.getAllFuncionarios());//add lista de objetos funcionario a view
        return mv;
    }

    //?
    @GetMapping("contas")
    public String contas(){
        return "contas";
    }

    //////////TESTING//////////
    @GetMapping("/inserefuncs")
    public String inserefuncs(){
        funcionarioService.insereListaFunc();
        return "redirect:/main/gestao";
    }

}
