package ms.Escuela.service;

import ms.Escuela.entity.Profesor;
import ms.Escuela.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
    private Integer cont=0;
    @Autowired
    ProfesorRepository profesorRepository;

    public Optional<Profesor> getProfesor(Integer id){
        return profesorRepository.findById(id);
    }

    public List<Profesor> getProfesores(){
        return profesorRepository.findAll();
    }

    public Profesor insertarProfesor(Profesor profesor){
        return profesorRepository.save(profesor);
    }

    public void eliminar(Integer id){
        profesorRepository.deleteById(id);
    }


    public Profesor actualizar(Profesor profesor){
        return profesorRepository.save(profesor);
    }

    public String calcularSalario(Profesor prof){
        String mensaje="";
        Double salario=0.0;
        Double descuentos=prof.getDescuentos();
        Integer horasLaboradas=prof.getHoras_laboradas();
        Integer horasNo=prof.getHoras_nolaboradas();
        Integer horasTotales=prof.getHoras_totales();
        Double precioHoras=prof.getPrecio_horas();
        if(horasTotales>(horasLaboradas+horasNo)){
            mensaje="Te falta trabajar más";
        } else if(horasTotales<(horasLaboradas+horasNo)){
            mensaje="Te pasaste de horas reportadas";
        }else{
             salario= (horasLaboradas*precioHoras)+(horasNo*(precioHoras/2))-descuentos;
             mensaje="Este es tu pago de este mes: "+ salario;
        }
        return mensaje;
    }

    public Profesor insertarProfe(){
        Profesor profesor=new Profesor(++cont, "Andres",50,20,30,250.00,3000.00,15);
        return profesorRepository.save(profesor);
    }
}
