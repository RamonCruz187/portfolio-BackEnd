
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
@Table (name= "skills")
public class Tecnologias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private int progress;
    
    @Column (name= "persona_id")
    private Integer personaId;

    public Tecnologias() {
    }

    public Tecnologias(Long id, String name, int progress, Integer personaId) {
        this.id = id;
        this.name = name;
        this.progress = progress;
        this.personaId = personaId;
    }
    
    
    
}
