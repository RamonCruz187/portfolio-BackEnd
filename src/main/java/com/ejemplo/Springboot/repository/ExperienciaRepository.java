
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>,CrudRepository <Experiencia, Long> {
    
}
