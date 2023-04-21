package ms.Escuela.repository;

import ms.Escuela.entity.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosRepository extends JpaRepository<Servicios, Integer> {

}
