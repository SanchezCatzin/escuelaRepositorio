package ms.Escuela.controller;

import ms.Escuela.entity.Empleado;
import ms.Escuela.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/empleado/{id}")
    public Optional<Empleado> getEmpleado(@PathVariable Integer id){
        return empleadoService.getEmpleado(id);
    }

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados(){
        return empleadoService.getEmpleados();
    }

    @PostMapping("/empleado/insert")
    public Empleado insertarEmpleado(@RequestBody Empleado empleado){
        return empleadoService.insertarEmpleado(empleado);
    }

    @PutMapping("/empleado/modificar")
    public Empleado modificar(@RequestBody Empleado empleado){
        return empleadoService.modificarEmpleado(empleado);
    }

    @DeleteMapping("/empleado/delete/{id}")
    public void delete(@PathVariable Integer id){
        empleadoService.borrarEmpleado(id);
    }

    @GetMapping("/horas/{pagoHora}/{horas}/{id}")
    public Empleado calcularSalario(@PathVariable double pagoHora, @PathVariable int horas, @PathVariable int id){
        return empleadoService.calcularSalario(pagoHora,horas,id);
    }


}
