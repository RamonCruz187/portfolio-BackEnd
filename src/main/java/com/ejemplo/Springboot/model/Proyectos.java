
package com.ejemplo.Springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name= "proyectos")
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String descripcion;
    private String urlProyecto;
    
    @Column (name= "persona_id")
    private Integer personaId;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String descripcion, String urlProyecto, Integer personaId) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
        this.personaId = personaId;
    }
    
    
    
}
