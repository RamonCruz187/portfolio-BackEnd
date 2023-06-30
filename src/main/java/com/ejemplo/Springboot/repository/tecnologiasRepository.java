
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.Tecnologias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tecnologiasRepository extends JpaRepository <Tecnologias, Long> {
    
}
