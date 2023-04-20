package ms.Escuela.entity;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado") private Integer id;

    @Column(name = "nombre") private String nombre;

    @Column(name = "puesto") private String puesto;

    @Column(name = "sueldo") private double sueldo;

    @Column(name = "id_escuela") private Integer idEscuela;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String puesto, double sueldo, Integer idEscuela) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.idEscuela = idEscuela;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(Integer idEscuela) {
        this.idEscuela = idEscuela;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", sueldo=" + sueldo +
                ", idEscuela=" + idEscuela +
                '}';
    }
}
