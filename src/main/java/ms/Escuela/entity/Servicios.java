package ms.Escuela.entity;

import javax.persistence.*;

@Entity
@Table(name = "Servicios")
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_Servicio")
    private int id_Servicio;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Descripcion")
    private String Descripcion;

    public Servicios(){

    }

    public Servicios(int id_Servicio, String nombre, String descripcion) {
        this.id_Servicio = id_Servicio;
        Nombre = nombre;
        Descripcion = descripcion;
    }

    public int getId_Servicio() {
        return id_Servicio;
    }

    public void setId_Servicio(int id_Servicio) {
        this.id_Servicio = id_Servicio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Servicios{" +
                "id_Servicio=" + id_Servicio +
                ", Nombre='" + Nombre + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
}
