
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
@Table (name= "experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String position;
    private String company;
    private String img;
    private String start;
    private String end;
    private String city;
    private String tipoEmpleo;
    private String tipoJornada;
    
    @Column (name= "persona_id")
    private Integer personaId;

    public Experiencia() {
    }

    public Experiencia(Long id, String position, String company, String img, String start, String end, String city, String tipoEmpleo, String tipoJornada, Integer personaId) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.img = img;
        this.start = start;
        this.end = end;
        this.city = city;
        this.tipoEmpleo = tipoEmpleo;
        this.tipoJornada = tipoJornada;
        this.personaId = personaId;
    }

    

    

    
    
    
    
}
