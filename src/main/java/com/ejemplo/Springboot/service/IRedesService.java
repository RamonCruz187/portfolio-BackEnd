
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.Redes;
import java.util.List;


public interface IRedesService {
    public List<Redes> verRedes();
    public void crearRed (Redes red);
    public void borrarRed (Long id);
    public Redes buscarRed (Long id);
}
