package com.paiv.projetoweb.entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImagemPerfil implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String type;
    //Coluna imagem, tamanho maximo 1000bytes
    @Column(name = "img", length=1000)
    private byte[] picByte;

    //implementar relacionamento com funcionario - one to one

    public ImagemPerfil(int id, String nome, String type, byte[] picByte) {
        this.nome = nome;
        this.type = type;
        this.picByte = picByte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getPicByte() {
        return picByte;
    }

    public void setPicByte(byte[] picByte) {
        this.picByte = picByte;
    }

    @Override
    public String toString() {
        return "ImagemPerfil [id=" + id + ", nome=" + nome + ", picByte=" + Arrays.toString(picByte) + ", type=" + type
                + "]";
    } 
}
