package com.example.UM2.repositorios;


import com.example.UM2.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository <Alumno, Long> {
}

