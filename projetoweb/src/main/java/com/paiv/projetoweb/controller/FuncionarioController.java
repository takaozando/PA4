package com.paiv.projetoweb.controller;

import java.util.List;

import com.paiv.projetoweb.entity.Funcionario;
import com.paiv.projetoweb.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;


//@RestController
@Controller
@RequestMapping("/main")
public class FuncionarioController {
    
    @Autowired
    FuncionarioService funcionarioService;

    //Retorna View Principal
    @GetMapping("/gestao")
    public ModelAndView gestao(){
        ModelAndView mv = new ModelAndView("gestao");//novo modelo e view com o nome da view
        mv.addObject("funcionarios",funcionarioService.getAllFuncionarios());//add lista de objetos funcionario a view
        return mv;
    }

    //Retorna View com lista de funcionarios
    @GetMapping("/funcionarios")
    public ModelAndView listarFuncionarios(){
        ModelAndView mv = new ModelAndView("funcionarios");//novo modelo e view com o nome da view
        mv.addObject("funcionarios",funcionarioService.getAllFuncionarios());//add lista de objetos funcionario a view
        return mv;
    
    }

    @GetMapping("/novofuncionario")
    public ModelAndView novoFuncionario(){
        ModelAndView mv = new ModelAndView("novoFuncionario");
        mv.addObject("funcionario", new Funcionario());
        return mv;
    }

    @PostMapping("/cadastrarfuncionario")
    public String cadastrarFuncionario(@ModelAttribute Funcionario funcionario){
        funcionarioService.saveFuncionario(funcionario);
        return "redirect:/main/gestao";
    }

    //TESTING
    @GetMapping("/inserefuncs")
    public String inserefuncs(){
        funcionarioService.insereListaFunc();
        return "redirect:/main/gestao";
    }
}
