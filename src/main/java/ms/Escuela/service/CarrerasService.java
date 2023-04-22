package ms.Escuela.service;

import ms.Escuela.entity.Carreras;
import ms.Escuela.entity.Profesor;
import ms.Escuela.repository.CarrerasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrerasService {
    @Autowired
    CarrerasRepository carrerasRepository;

    public Optional<Carreras> getCarreras(Integer id){
        return carrerasRepository.findById(id);
    }

    public List<Carreras> getCarrerasS(){
        return carrerasRepository.findAll();
    }

    public Carreras insertarCarreras(Carreras carreras){
        return carrerasRepository.save(carreras);
    }

    public void eliminar(Integer id){
        carrerasRepository.deleteById(id);
    }


    public Carreras actualizar(Carreras carreras){
        return carrerasRepository.save(carreras);
    }


    //Carrera
    public String calcularCarrera(Carreras carreras){
        String mensaje="";
        String nombre=carreras.getNombre();
        Integer duracion =carreras.getDuracion();
        String area=carreras.getArea();

        if(duracion == 5){
            mensaje="Tu carrera es del area de" + area;
        } else if(duracion == 4){
            mensaje="Tu carrera es del area de" + area;
        }else{

            mensaje="Tu carrera no pertenece a este campus ";
        }
        return mensaje;
    }


}
