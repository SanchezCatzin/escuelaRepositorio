package ms.Escuela.service;

import ms.Escuela.entity.Aulas;
import ms.Escuela.repository.AulasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AulasService {

    @Autowired
    AulasRepository aulasRepository;

    public List<Aulas> getAulas(){
       return aulasRepository.findAll();
    }

    public Optional<Aulas> getAulas(Integer id){
        return aulasRepository.findById(id);
    }

    public Aulas insertAulas(Aulas aulas){
        return aulasRepository.save(aulas);
    }

    public void borrar(int id){
        aulasRepository.deleteById(id);
    }

    public Aulas actualizar(Aulas aulas){
        return aulasRepository.save(aulas);
    }

}
