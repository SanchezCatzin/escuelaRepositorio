package ms.Escuela.controller;


import ms.Escuela.entity.Profesor;
import ms.Escuela.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("devprofesor")
public class ProfesorController {
    @Autowired
    ProfesorService profesorService;

    @GetMapping("/profesor/{id}")
    public Optional<Profesor> buscarProfesor(@PathVariable int id){
        return profesorService.getProfesor(id);
    }

    @GetMapping("/profesores")
    public List<Profesor> getProfesores(){
        return profesorService.getProfesores();
    }

    @PostMapping("/insertar")
    public Profesor insertarProfesor(@RequestBody Profesor profesor){
        return profesorService.insertarProfesor(profesor);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id){
        profesorService.eliminar(id);
    }

    @PutMapping("/modificar")
    public Profesor modificar(@RequestBody Profesor profesor){
        return profesorService.actualizar(profesor);
    }
}
