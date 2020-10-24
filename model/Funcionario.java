package com.example.pa4_backend.model;

import java.time.LocalDateTime;

public class Funcionario {
    private String name;
    private String escritorio;
    private String descricao;
    private int    age;
    private LocalDateTime expire_date; 
    private String posicao;
    private int codigo;

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
