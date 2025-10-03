package com.example.parcial2.repositorios;

import com.example.parcial2.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ICineRepositorio extends JpaRepository<Cine,Long> {

    List<Cine>findByNombre(String nombre);

}