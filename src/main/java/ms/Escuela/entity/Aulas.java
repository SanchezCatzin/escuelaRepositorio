package ms.Escuela.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Aulas")
@Data
@AllArgsConstructor
@ToString
@Builder
public class Aulas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_Aula")
    private int id;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Capacidad")
    private int Capacidad;

    @Column(name = "Tipo")
    private String Tipo;

    @ManyToOne
    @JoinColumn(name = "id_Campus")
    private Campus id_Campus;

    public Aulas() {
    }
}
