
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectosRepository extends JpaRepository <Proyectos, Long> {
    
}
