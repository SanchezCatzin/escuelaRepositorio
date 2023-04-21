package ms.Escuela.service;

import ms.Escuela.entity.Aulas;
import ms.Escuela.entity.Servicios;
import ms.Escuela.repository.AulasRepository;
import ms.Escuela.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiciosService {

    @Autowired
    ServiciosRepository serviciosRepository;

    public List<Servicios> getServicios(){
        return serviciosRepository.findAll();
    }

    public Optional<Servicios> getServicios(Integer id){
        return serviciosRepository.findById(id);
    }

    public Servicios insertServicio(Servicios servicio){
        return serviciosRepository.save(servicio);
    }

    public void borrar(int id){
        serviciosRepository.deleteById(id);
    }

    public Servicios actualizar(Servicios servicio){
        return serviciosRepository.save(servicio);
    }


}
