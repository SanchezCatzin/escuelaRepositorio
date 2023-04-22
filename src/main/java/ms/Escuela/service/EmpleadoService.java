package ms.Escuela.service;

import ms.Escuela.entity.Aulas;
import ms.Escuela.entity.Campus;
import ms.Escuela.entity.Empleado;
import ms.Escuela.entity.Profesor;
import ms.Escuela.repository.AulasRepository;
import ms.Escuela.repository.CampusRepository;
import ms.Escuela.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Autowired
    AulasRepository aulasRepository;

    @Autowired
    CampusRepository campusRepository;


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

    public Empleado calcularSalario(double phora,int horas,int id){
        Empleado empleado=empleadoRepository.findById(id).get();
        empleado.setSueldo(phora*horas);
        return empleadoRepository.save(empleado);
    }

    public String toStringEmpleado(Integer id){
        Empleado empleado = empleadoRepository.findById(id).get();
        Aulas aulas = aulasRepository.findById(4).get();
        Campus campus = campusRepository.findById(2).get();

        return  "El nombre del empleado es: " + empleado.getNombre()
                + "\nEl puesto es: " + empleado.getPuesto()
                + "\nEl sueldo es: " + empleado.getSueldo()
                + "\nLa escuela es: " + aulas.getNombre()
                + "\nEl campus es: "+ campus.getNombre();
    }

}
