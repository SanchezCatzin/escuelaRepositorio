package ms.Escuela.service;

import ms.Escuela.entity.Campus;
import ms.Escuela.repository.CampusRepository;
import ms.Escuela.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampusService {

    @Autowired
    CampusRepository campusRepository;

    public Optional<Campus> getCampus(Integer id){
        return campusRepository.findById(id);
    }

    public List<Campus> getCampuses(){
        return campusRepository.findAll();
    }

    public Campus insertarCampus(Campus campus){
        return campusRepository.save(campus);
    }

    public void borrarCampus(Integer id){
        campusRepository.deleteById(id);
    }


}
