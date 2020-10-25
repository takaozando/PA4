package com.paiv.projetoweb.service;

import java.time.LocalDateTime;
import java.util.List;

import com.paiv.projetoweb.entity.Funcionario;
import com.paiv.projetoweb.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    
    @Autowired
    FuncionarioRepository funcionarioRepository;

    //private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    //private static int nextCodigo = 1;

    public Funcionario saveFuncionario(Funcionario f){
        //funcionario.setCodigo(nextCodigo++);
        //funcionarios.add(funcionario);

        funcionarioRepository.save(f);
        
        return f;
    }

    public List<Funcionario> getAllFuncionarios(){
        return funcionarioRepository.findAll();
    }

    public Funcionario getFuncionarioByCodigo(int codigo){
        
        for(Funcionario f: funcionarioRepository.findAll()){
            if(f.getCodigo() == codigo){
                return f;
            }
        }

        return null;
    }

	public void removeFuncionario(Funcionario f) {
        if(getFuncionarioByCodigo(f.getCodigo()) != null){
            funcionarioRepository.deleteById(f.getCodigo());
        }
	}

	public Funcionario updateFuncionario(Funcionario f) {

        Funcionario alterar = getFuncionarioByCodigo(f.getCodigo());
        
        if(alterar != null){
            alterar.setName(f.getName());
            alterar.setEscritorio(f.getEscritorio());
            alterar.setDescricao(f.getDescricao());
            alterar.setAge(f.getAge());
            alterar.setExpire_date(f.getExpire_date());
            alterar.setPosicao(f.getPosicao());
            return alterar;     
       }
       else
       {
           return null;
       }
    }
    
    //TESTING
    public void insereListaFunc(){
        LocalDateTime time = LocalDateTime.now();
        funcionarioRepository.save(new Funcionario("Joao",52,"CEO","Escritorio A","CEO da empresa",time));
        funcionarioRepository.save(new Funcionario("Jonas",24,"Jardineiro","Escritorio A","Jardineiro mestre da empresa",time));
        funcionarioRepository.save(new Funcionario("Moacir",19,"Programador","Escritorio E","Programador da empresa",time));
        funcionarioRepository.save(new Funcionario("Gertrudes",73,"Guarda","Escritorio B","Guarda da empresa",time));
        funcionarioRepository.save(new Funcionario("Marcelo",44,"Gestor","Escritorio C","Gestor da empresa",time));



    }



}
