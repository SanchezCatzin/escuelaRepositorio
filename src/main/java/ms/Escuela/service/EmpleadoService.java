package ms.Escuela.service;

import ms.Escuela.entity.Empleado;
import ms.Escuela.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public Optional<Empleado> getEmpleado(Integer id){
        return empleadoRepository.findById(id);
    }

    public List<Empleado> getEmpleados(){
        return empleadoRepository.findAll();
    }

    public Empleado insertarEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public Empleado modificarEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public void borrarEmpleado(Integer id){
        empleadoRepository.deleteById(id);
    }

}
