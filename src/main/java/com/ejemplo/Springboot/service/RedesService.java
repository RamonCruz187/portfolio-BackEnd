
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Redes;
import com.ejemplo.Springboot.repository.redesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedesService implements IRedesService {
    @Autowired
    public redesRepository redRepo;

    @Override
    public List<Redes> verRedes() {
        return redRepo.findAll();
    }

    @Override
    public void crearRed(Redes red) {
        redRepo.save(red);
    }

    @Override
    public void borrarRed(Long id) {
        redRepo.deleteById(id);
    }

    @Override
    public Redes buscarRed(Long id) {
        return redRepo.findById(id).orElse(null);
    }
}
