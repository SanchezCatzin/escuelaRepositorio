package ms.Escuela.controller;

import ms.Escuela.entity.Campus;
import ms.Escuela.service.CampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev")
public class CampusController {

    @Autowired
    CampusService campusService;

    @GetMapping("/campus/{id}")
    public Optional<Campus> getCampus(@PathVariable Integer id){
        return campusService.getCampus(id);
    }

    @GetMapping("/campuses")
    public List<Campus> getCampuses(){
        return campusService.getCampuses();
    }

    @PostMapping("/campuses/insert")
    public Campus insertarCampus(@RequestBody Campus campus){
        return campusService.insertarCampus(campus);
    }

    @PutMapping("/campus/modificar")
    public Campus modificar(@RequestBody Campus campus){
        return campusService.insertarCampus(campus);
    }

    @DeleteMapping("/campus/delete/{id}")
    public void delete(@PathVariable Integer id){
        campusService.borrarCampus(id);
    }

}
