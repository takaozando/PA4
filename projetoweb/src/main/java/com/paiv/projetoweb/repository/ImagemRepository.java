package com.paiv.projetoweb.repository;

import com.paiv.projetoweb.entity.ImagemPerfil;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemRepository extends JpaRepository<ImagemPerfil,Integer>{
    
}
