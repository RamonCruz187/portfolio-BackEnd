
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Tecnologias;
import java.util.List;

public interface ITecnologiasService {
    public List<Tecnologias> verTecnologias();
    public void crearTecnologia (Tecnologias tec);
    public void borrarTecnologia (Long id);
    public Tecnologias buscarTecnologia (Long id);
}
