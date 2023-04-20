package main.java.ms.Escuela.service;

import main.java.ms.Escuela.entity.Carreras;
import main.java.ms.Escuela.repository.CarrerasRepository;
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
}
