
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface redesRepository extends JpaRepository <Redes, Long> {
    
}
