
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
@Table (name= "redes")
public class Redes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String tipoRed;
    private String urlRed;
    private String iconoRed;
    
    @Column (name= "persona_id")
    private Integer personaId;

    public Redes() {
    }

    public Redes(Long id, String tipoRed, String urlRed, String iconoRed, Integer personaId) {
        this.id = id;
        this.tipoRed = tipoRed;
        this.urlRed = urlRed;
        this.iconoRed = iconoRed;
        this.personaId = personaId;
    }
    
    
            
            
}
