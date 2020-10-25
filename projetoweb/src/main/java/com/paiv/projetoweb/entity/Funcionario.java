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

    private String name;
    private int age;
    private String posicao;
    private String escritorio;
    private String descricao;
    private LocalDateTime expire_date; 
    
    public Funcionario(String name, int age, String posicao, String escritorio, String descricao,
            LocalDateTime expire_date) {
        this.name = name;
        this.age = age;
        this.posicao = posicao;
        this.escritorio = escritorio;
        this.descricao = descricao;
        this.expire_date = expire_date;
    }
    
    public Funcionario(){}

    @Override
    public String toString() {
        return "Funcionario [age=" + age + ", codigo=" + codigo + ", descrição=" + descricao + ", escritorio="
                + escritorio + ", expire_date=" + expire_date + ", name=" + name + ", posicao=" + posicao + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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



}