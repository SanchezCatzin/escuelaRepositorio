package ms.Escuela.controller;

import ms.Escuela.entity.Aulas;
import ms.Escuela.service.AulasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("aulas")
@RestController
public class AulasController {

    @Autowired
    AulasService aulasService;

    @GetMapping("/aulas")
    public List<Aulas> getAulas(){
        return aulasService.getAulas();
    }

    @GetMapping("/aula/{id}")
    public Optional<Aulas> buscarAula(@PathVariable int id){
        return aulasService.getAulas(id);
    }

    @PostMapping("/insert")
    public Aulas insertAula(@RequestBody Aulas aula){
        return aulasService.insertAulas(aula);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable int id){
        aulasService.borrar(id);
    }

    @PutMapping("/modificar")
    public Aulas modificar(@RequestBody Aulas aula){
        return aulasService.actualizar(aula);
    }
}
