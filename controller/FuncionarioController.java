package com.example.pa4_backend.controller;

import java.net.URI;
import java.util.ArrayList;

import com.example.pa4_backend.model.Funcionario;
import com.example.pa4_backend.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioRepository repository;
    
     // Salvar um novo pedido
     @PostMapping
     public ResponseEntity<Void> salvar(@RequestBody Funcionario funcionario) {
         funcionario = repository.save(funcionario);
         URI uri = URI.create("http://localhost:8080/funcionarios/" + funcionario.getCodigo());
         return ResponseEntity.created(uri).build();
     }
 
     // Retornar todos os pedidos
     @GetMapping
     public ArrayList<Funcionario> getTodosFuncionarios() {
         return repository.getAll();
     }

     @GetMapping("/gestao")
     public String gestao(){
         return "index";
     }
 
     @GetMapping("{codigo}")
     public ResponseEntity<Funcionario> getFuncionarioByCodigo(@PathVariable int codigo) {
        Funcionario funcionario = repository.getFuncionarioByCodigo(codigo);
         if (funcionario != null) {
             return ResponseEntity.ok(funcionario);
         } else {
             return ResponseEntity.notFound().build();
         }
     }
 
     @DeleteMapping("{codigo}")
     public ResponseEntity<Void> removerByCodigo(@PathVariable int codigo) {
        Funcionario funcionario = repository.getFuncionarioByCodigo(codigo);
         if (funcionario != null) {
             repository.remove(funcionario);
             return ResponseEntity.noContent().build();
         } else {
             return ResponseEntity.notFound().build();
         }
     }
 
 
     @PutMapping("{codigo}")
     public ResponseEntity<Funcionario> alterar(@PathVariable int codigo,
                                         @RequestBody  Funcionario funcionario
                                        )
     {
     
         if (repository.getFuncionarioByCodigo(codigo) != null) {
            funcionario.setCodigo(codigo);
            funcionario = repository.update(funcionario);
             if(funcionario != null){
                 return ResponseEntity.ok(funcionario);
             }
         } 
                 
         return ResponseEntity.notFound().build();
         
     }
 
 
 
 }
