
package com.ejemplo.Springboot.service;


import com.ejemplo.Springboot.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> verProyectos();
    public void crearProyecto (Proyectos pro);
    public void borrarProyecto (Long id);
    public Proyectos buscarProyecto (Long id);
}
