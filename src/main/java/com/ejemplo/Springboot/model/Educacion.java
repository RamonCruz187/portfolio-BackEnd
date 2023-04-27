
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
@Table (name= "educacion")
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String school;
    private String title;
    private String img;
    private String carrer;
    private String start;
    private String end;
    private String estadoEducacion;
    
    
    
    @Column (name= "persona_id")
    private Integer personaId;

    public Educacion() {
    }

    public Educacion(Long id, String school, String title, String img, String carrer, String start, String end, String estadoEducacion, Integer personaId) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.img = img;
        this.carrer = carrer;
        this.start = start;
        this.end = end;
        this.estadoEducacion = estadoEducacion;
        this.personaId = personaId;
    }

    

    
    
    
    
    
}
