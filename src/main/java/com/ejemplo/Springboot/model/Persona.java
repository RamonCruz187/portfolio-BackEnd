package com.ejemplo.Springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String position;
    private String ubication;
    private String about;
    private String logo;
    private String tel;
    private String mail;
    private String image;
    private String backimage;
    private String contrasena;

    @OneToMany(mappedBy = "personaId")
    private List<Experiencia> experiencias;

    @OneToMany(mappedBy = "personaId")
    private List<Educacion> educacion;

    @OneToMany(mappedBy = "personaId")
    private List<Proyectos> proyecto;

    @OneToMany(mappedBy = "personaId")
    private List<Redes> red;

    @OneToMany(mappedBy = "personaId")
    private List<Tecnologias> tecnologia;

    public Persona() {
    }

    public Persona(Long id, String name, String position, String ubication, String about, String logo, String tel, String mail, String image, String backimage, String contrasena, List<Experiencia> experiencias, List<Educacion> educacion, List<Proyectos> proyecto, List<Redes> red, List<Tecnologias> tecnologia) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.ubication = ubication;
        this.about = about;
        this.logo = logo;
        this.tel = tel;
        this.mail = mail;
        this.image = image;
        this.backimage = backimage;
        this.contrasena = contrasena;

        experiencias = new ArrayList();
        educacion = new ArrayList();
        proyecto = new ArrayList();
        red = new ArrayList();
        tecnologia = new ArrayList();
    }

}
