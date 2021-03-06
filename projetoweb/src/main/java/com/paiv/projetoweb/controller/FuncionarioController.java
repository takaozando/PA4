
package com.paiv.projetoweb.controller;

import com.paiv.projetoweb.entity.Funcionario;
import com.paiv.projetoweb.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping("/main")
public class FuncionarioController {
    
    @Autowired
    FuncionarioService  funcionarioService;

    //Retorna View com lista de funcionarios
    @GetMapping("/funcionarios")
    public ModelAndView listarFuncionarios(){
        ModelAndView mv = new ModelAndView("funcionarios");//novo modelo e view com o nome da view
        mv.addObject("funcionarios",funcionarioService.getAllFuncionarios());//add lista de objetos funcionario a view
        return mv;
    }

    //Retorna View para criaçao de um novo funcionario
    @GetMapping("/novofuncionario")
    public ModelAndView novoFuncionario(){
        ModelAndView mv = new ModelAndView("novoFuncionario");
        mv.addObject("funcionario", new Funcionario());
        return mv;
    }

    //Salva funcionario criado / Atualiza funcionario existente com o mesmo id
    @PostMapping("/cadastrarfuncionario")
    public String cadastrarFuncionario(@ModelAttribute Funcionario funcionario){
        funcionarioService.saveFuncionario(funcionario);
        return "redirect:/main/funcionarios";
    }

    //Remove funcionario pelo id passado
    @GetMapping("/removerfuncionario")
    public String removerFuncionario(@RequestParam Integer codigo){
        Funcionario funcionario = funcionarioService.getFuncionarioByCodigo(codigo);
        funcionarioService.removeFuncionario(funcionario);
        //implementar - verificar se existe func - throw exception
        return "redirect:/main/funcionarios";
    }

    //Retorna view com dados do funcionario para edição
    @GetMapping("/editarfuncionario")
    public ModelAndView editarFuncionario(@RequestParam Integer codigo){
        ModelAndView mv = new ModelAndView("editarFuncionario");
        mv.addObject("func", funcionarioService.getFuncionarioByCodigo(codigo));
        return mv;
    }
}
