package com.example.UM2.repositorios;

import com.example.UM2.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
