package ms.Escuela.entity;

import javax.persistence.*;

@Entity
@Table(name = "Aulas")
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

    @Column(name = "id_Campus")
    private int id_Campus;

    public Aulas(){

    }
    public Aulas(int id, String nombre, int capacidad, String tipo, int id_Campus) {
        this.id = id;
        Nombre = nombre;
        Capacidad = capacidad;
        Tipo = tipo;
        this.id_Campus = id_Campus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getId_Campus() {
        return id_Campus;
    }

    public void setId_Campus(int id_Campus) {
        this.id_Campus = id_Campus;
    }

    @Override
    public String toString() {
        return "Aulas{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Capacidad=" + Capacidad +
                ", Tipo='" + Tipo + '\'' +
                ", id_Campus=" + id_Campus +
                '}';
    }
}
