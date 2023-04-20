package main.java.ms.Escuela.repository;

import main.java.ms.Escuela.entity.Carreras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrerasRepository extends JpaRepository<Carreras, Integer> {
}
