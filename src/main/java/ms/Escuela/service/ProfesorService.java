package main.java.ms.Escuela.service;

import main.java.ms.Escuela.entity.Profesor;
import main.java.ms.Escuela.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
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
}
