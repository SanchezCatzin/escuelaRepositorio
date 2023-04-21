package ms.Escuela.entity;

import javax.persistence.*;

@Entity
@Table(name = "profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Integer id_profesor;

    @Column(name = "nombre")
    private String nombre;


    @Column(name = "horas_totales")
    private int horas_totales;

    @Column(name = "horas_laboradas")
    private int horas_laboradas;

    @Column(name = "horas_nolaboradas")
    private int horas_nolaboradas;

    @Column(name = "precio_horas")
    private Double precio_horas;

    @Column(name = "descuentos")
    private Double descuentos;

    @Column(name = "antiguedad")
    private int antiguedad;




    public Profesor() {
    }

    public Profesor(Integer id_profesor, String nombre, int horas_totales, int horas_laboradas, int horas_nolaboradas, Double precio_horas, Double descuentos, int antiguedad) {
        this.id_profesor = id_profesor;
        this.nombre = nombre;
        this.horas_totales = horas_totales;
        this.horas_laboradas = horas_laboradas;
        this.horas_nolaboradas = horas_nolaboradas;
        this.precio_horas = precio_horas;
        this.descuentos = descuentos;
        this.antiguedad = antiguedad;
    }

    public Integer getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(Integer id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras_totales() {
        return horas_totales;
    }

    public void setHoras_totales(int horas_totales) {
        this.horas_totales = horas_totales;
    }

    public int getHoras_laboradas() {
        return horas_laboradas;
    }

    public void setHoras_laboradas(int horas_laboradas) {
        this.horas_laboradas = horas_laboradas;
    }

    public int getHoras_nolaboradas() {
        return horas_nolaboradas;
    }

    public void setHoras_nolaboradas(int horas_nolaboradas) {
        this.horas_nolaboradas = horas_nolaboradas;
    }

    public Double getPrecio_horas() {
        return precio_horas;
    }

    public void setPrecio_horas(Double precio_horas) {
        this.precio_horas = precio_horas;
    }

    public Double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Double descuentos) {
        this.descuentos = descuentos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id_profesor=" + id_profesor +
                ", nombre='" + nombre + '\'' +
                ", horas_totales=" + horas_totales +
                ", horas_laboradas=" + horas_laboradas +
                ", horas_nolaboradas=" + horas_nolaboradas +
                ", precio_horas=" + precio_horas +
                ", descuentos=" + descuentos +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
