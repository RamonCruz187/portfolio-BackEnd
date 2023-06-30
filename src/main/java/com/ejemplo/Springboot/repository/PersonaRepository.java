
package com.ejemplo.Springboot.repository;

import com.ejemplo.Springboot.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>,CrudRepository <Persona, Long> {
    public List<Persona> findByMailAndContrasena(String mail, String Contrasena);
}
