package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Estudiante;

//Interface que extends de JPA para acceder a los métodos.
@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long>{

}
