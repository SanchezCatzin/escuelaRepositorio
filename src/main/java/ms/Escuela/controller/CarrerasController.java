package ms.Escuela.controller;

import ms.Escuela.entity.Carreras;
import ms.Escuela.entity.Profesor;
import ms.Escuela.service.CarrerasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("devcarreras")
public class CarrerasController {
    @Autowired
    CarrerasService carrerasService;

    @GetMapping("/carreras/{id}")
    public Optional<Carreras> buscarCarreras(@PathVariable int id){
        return carrerasService.getCarreras(id);
    }

    @GetMapping("/carrerasS")
    public List<Carreras> getCarrerasS(){
        return carrerasService.getCarrerasS();
    }

    @PostMapping("/insertar")
    public Carreras insertarCarreras(@RequestBody Carreras carreras){
        return carrerasService.insertarCarreras(carreras);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id){
        carrerasService.eliminar(id);
    }

    @PutMapping("/modificar")
    public Carreras modificar(@RequestBody Carreras carreras){
        return carrerasService.actualizar(carreras);
    }

    //Carrera
    @GetMapping("/calcularCarrera")
    public String calcularCarrera(@RequestBody Carreras carreras){
        return carrerasService.calcularCarrera(carreras);
    }
}
