package ms.Escuela.entity;

import javax.persistence.*;

@Entity
@Table(name = "carreras")
public class Carreras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    private Integer id_carrera;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "duracion")
    private int duracion;

    @Column(name = "area")
    private String area;

    /*@Column(name = "id_campus")
    private int id_campus;*/
    /*@ManyToOne
    @JoinColumn(name = "id_campus")
    private Campus campus;*/

    /*@ManyToOne
    @JoinColumn(name = "id_escuela")
    private Escuela escuela;*/

    /*@OneToMany(mappedBy = "carrera")
    private List<Materia> materias;
    public Carreras() {
    }*/

    public Carreras() {
    }

    public Carreras(Integer id_carrera, String nombre, int duracion, String area) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
        this.duracion = duracion;
        this.area = area;
    }

    public Integer getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(Integer id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Carreras{" +
                "id_carrera=" + id_carrera +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", area='" + area + '\'' +
                '}';
    }
}
