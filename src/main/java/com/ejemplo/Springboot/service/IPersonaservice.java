
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Persona;
import java.util.List;


public interface IPersonaservice {
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    public Persona loginPersona(String mail, String clave);
}
