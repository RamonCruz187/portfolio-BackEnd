package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Persona;
import com.ejemplo.Springboot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaservice {
    
    @Autowired
     public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    @Override
    public Persona loginPersona(String mail, String contrasena){
    List<Persona> personas = persoRepo.findByMailAndContrasena(mail,contrasena );
    
    if(!personas.isEmpty()){
    return personas.get(0);
    }
    return null;
    }
    
    
}
