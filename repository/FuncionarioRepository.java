package com.example.pa4_backend.repository;
import java.util.ArrayList;

import com.example.pa4_backend.model.Funcionario;

import org.springframework.stereotype.Component;




@Component
public class FuncionarioRepository {

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static int nextCodigo = 1;

    public Funcionario save(Funcionario funcionario){
        funcionario.setCodigo(nextCodigo++);
        funcionarios.add(funcionario);
        return funcionario;
    }

    public ArrayList<Funcionario> getAll(){
        return funcionarios;
    }

    public Funcionario getFuncionarioByCodigo(int codigo){
        
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getCodigo() == codigo){
                return funcionario;
            }
        }

        return null;
    }

	public void remove(Funcionario funcionario) {
        if(getFuncionarioByCodigo(funcionario.getCodigo()) != null){
            funcionarios.remove(funcionario);
        }
	}

	public Funcionario update(Funcionario funcionario) {

        Funcionario alterar = getFuncionarioByCodigo(funcionario.getCodigo());
        if(alterar != null){
            alterar.setName(funcionario.getName());
            alterar.setEscritorio(funcionario.getEscritorio());
            alterar.setDescricao(funcionario.getDescricao());
            alterar.setAge(funcionario.getAge());
            alterar.setExpire_date(funcionario.getExpire_date());
            alterar.setPosicao(funcionario.getPosicao());
            return alterar;     
       }
       else
       {
           return null;
       }
	}

    
}
