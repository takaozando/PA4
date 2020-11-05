package com.paiv.projetoweb.entity;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private String nome;
    private int idade;//substituiçao de idade por nascimento e calcular idade
    private String posicao;
    private String escritorio;
    private String descricao;
    private LocalDateTime expire_date;//mudar tipo de data
    private Double salario;
    private String status;//implementar status do funcionario -> ativo, deixou a empresa, falecido, ferias...
    
    public Funcionario(String nome, int idade, String posicao, String escritorio, String descricao,
            LocalDateTime expire_date, Double salario, String status) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.escritorio = escritorio;
        this.descricao = descricao;
        this.expire_date = expire_date;
        this.salario = salario;
        if (status==null)
            this.status="Funcionario regular";
        else
            this.status=status;
    }
    
    public Funcionario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(String escritorio) {
        this.escritorio = escritorio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDateTime getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(LocalDateTime expire_date) {
        this.expire_date = expire_date;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getStatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Funcionario [codigo=" + codigo + ", descricao=" + descricao + ", escritorio=" + escritorio
                + ", expire_date=" + expire_date + ", idade=" + idade + ", nome=" + nome + ", posicao=" + posicao
                + ", salario=" + salario + ", status="+ status +"]";
    }

}