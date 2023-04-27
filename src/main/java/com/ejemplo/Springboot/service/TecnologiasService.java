
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Tecnologias;
import com.ejemplo.Springboot.repository.tecnologiasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiasService implements ITecnologiasService {
    @Autowired
    public tecnologiasRepository tecRepo;

    @Override
    public List<Tecnologias> verTecnologias() {
        return tecRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologias tec) {
        tecRepo.save(tec);
    }

    @Override
    public void borrarTecnologia(Long id) {
        tecRepo.deleteById(id);
    }

    @Override
    public Tecnologias buscarTecnologia(Long id) {
        return tecRepo.findById(id).orElse(null);
    }
}
