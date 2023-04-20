package ms.Escuela.controller;

import ms.Escuela.entity.Aulas;
import ms.Escuela.entity.Servicios;
import ms.Escuela.service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("servicios")
@RestController
public class ServiciosController {

    @Autowired
    ServiciosService serviciosService;

    @GetMapping("/servicios")
    public List<Servicios> getServicios(){
        return serviciosService.getServicios();
    }

    @GetMapping("/servicio/{id}")
    public Optional<Servicios> buscarServicio(@PathVariable int id){
        return serviciosService.getServicios(id);
    }

    @PostMapping("/insert")
    public Servicios inserServicio(@RequestBody Servicios servicio){
        return serviciosService.insertServicio(servicio);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable int id){
        serviciosService.borrar(id);
    }

    @PutMapping("/modificar")
    public Servicios modificar(@RequestBody Servicios servicio){
        return serviciosService.actualizar(servicio);
    }

}
