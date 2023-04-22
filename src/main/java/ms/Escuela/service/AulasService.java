package ms.Escuela.service;

import ms.Escuela.entity.Aulas;
import ms.Escuela.entity.Campus;
import ms.Escuela.repository.AulasRepository;
import ms.Escuela.repository.CampusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AulasService {

    @Autowired
    AulasRepository aulasRepository;

    @Autowired
    CampusRepository campusRepository;

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

    public Aulas actualizar(){
        Campus camp=campusRepository.findById(1).get();
        Aulas aul=new Aulas(23,"dfs",34,"sdfws",camp);
        return aulasRepository.save(aul);
    }

}
