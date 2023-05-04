
package com.ejemplo.Springboot.Controller;

import com.ejemplo.Springboot.model.Educacion;
import com.ejemplo.Springboot.model.Experiencia;
import com.ejemplo.Springboot.model.Persona;
import com.ejemplo.Springboot.model.Proyectos;
import com.ejemplo.Springboot.model.Redes;
import com.ejemplo.Springboot.model.Tecnologias;
import com.ejemplo.Springboot.service.IEducacionService;
import com.ejemplo.Springboot.service.IExperienciaService;
import com.ejemplo.Springboot.service.IPersonaservice;
import com.ejemplo.Springboot.service.IProyectosService;
import com.ejemplo.Springboot.service.IRedesService;
import com.ejemplo.Springboot.service.ITecnologiasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {
    
    @Autowired
    private IPersonaservice persoServ;
    
    @Autowired
    private IExperienciaService expServ;
    
    @Autowired
    private IEducacionService eduServ;
    
    @Autowired
    private IProyectosService proServ;
    
    @Autowired
    private IRedesService redServ;
    
    @Autowired
    private ITecnologiasService tecServ;
    
    
    //-----------------Login y persona--------------------------------
    
    @PostMapping ("/autenticacion/login")
    public Persona loginPersona(@RequestBody Persona pers){
    return persoServ.loginPersona(pers.getMail(), pers.getContrasena());
    }
    
    
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
   
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @PutMapping ("editar/persona/{id}")
    public void editarPersona (@RequestBody Persona per){
        persoServ.crearPersona(per);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
    persoServ.borrarPersona(id);
    }
    
    
   //------------------Experiencia--------------------------------------
    
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @PostMapping ("new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @PutMapping ("editar/experiencia/{id}")
    public void editarExperiencia (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @DeleteMapping ("/borrar_exp/{id}")
    public void borrarExperiencia (@PathVariable Long id){
    expServ.borrarExperiencia(id);
    }
  
    //-------------------Educacion--------------------------------
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
    @PostMapping ("new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @PutMapping ("editar/educacion/{id}")
    public void editarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @DeleteMapping ("/borrar_edu/{id}")
    public void borrarEducacion (@PathVariable Long id){
    eduServ.borrarEducacion(id);
    }
    
    //------------------Proyectos----------------------------------
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proServ.verProyectos();
    }
    
    @PostMapping ("new/proyecto")
    public void agregarProyecto (@RequestBody Proyectos pro){
        proServ.crearProyecto(pro);
    }
    
    @DeleteMapping ("/borrar_pro/{id}")
    public void borrarProyecto (@PathVariable Long id){
    proServ.borrarProyecto(id);
    }
    
    @PutMapping ("editar/proyecto/{id}")
    public void editarProyecto (@RequestBody Proyectos pro){
        proServ.crearProyecto(pro);
    }
    
    //----------------Redes------------------------------------
    
    @GetMapping ("/ver/redes")
    @ResponseBody
    public List<Redes> verRedes(){
        return redServ.verRedes();
    }
    
    @PostMapping ("new/red")
    public void agregarRed (@RequestBody Redes red){
        redServ.crearRed(red);
    }
    
    @DeleteMapping ("/borrar_red/{id}")
    public void borrarRed (@PathVariable Long id){
    redServ.borrarRed(id);
    }
    
    @PutMapping ("editar/red/{id}")
    public void editarRed (@RequestBody Redes red){
        redServ.crearRed(red);
    }
    
    //----------------Tecnologias---------------------------
    
    @GetMapping ("/ver/tecnologias")
    @ResponseBody
    public List<Tecnologias> verTecnologias(){
        return tecServ.verTecnologias();
    }
    
    @PostMapping ("new/tecnologia")
    public void agregarTecnologia (@RequestBody Tecnologias tec){
        tecServ.crearTecnologia(tec);
    }
    
    @DeleteMapping ("/borrar_tecnologia/{id}")
    public void borrarTecnologia (@PathVariable Long id){
    tecServ.borrarTecnologia(id);
    }
    
    @PutMapping ("editar/tecnologia/{id}")
    public void editarTecnologia (@RequestBody Tecnologias tec){
        tecServ.crearTecnologia(tec);
    }
}
