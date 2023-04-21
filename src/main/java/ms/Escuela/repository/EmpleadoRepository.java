package ms.Escuela.repository;

import ms.Escuela.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface EmpleadoRepository extends JpaRepository <Empleado, Integer>{
}
