package com.example.parcial2.repositorios;

import com.example.parcial2.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IDetalleCineRepositorio extends JpaRepository<DetalleCine, Long> {


    List<DetalleCine> findByCiudad(String ciudad);
}