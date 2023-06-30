
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepository extends JpaRepository <Educacion, Long> {
    
}
