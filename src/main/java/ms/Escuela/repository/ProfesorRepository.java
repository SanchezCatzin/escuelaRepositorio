package ms.Escuela.repository;

import ms.Escuela.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
//    @Query(value = "INSERT INTO escuela.profesores (antiguedad, descuentos," +
//            " horas_laboradas, horas_nolaboradas, horas_totales, nombre, precio_horas) \n" +
//            "VALUES(20, 3000, 40, 30, 40, 'Andres', 200)",nativeQuery = true)
}
