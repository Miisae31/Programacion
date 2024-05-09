package orm;

import java.time.LocalDateTime;

public class Actor {
    private int id;
    private String nombre;
    private String apellido;
    private LocalDateTime fecha;
    private boolean nuevo;
    private boolean modificado;

    public Actor(int id, String nombre, String apellido, LocalDateTime fecha, boolean nuevo, boolean modificado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.nuevo = nuevo;
        this.modificado = modificado;
    }

    public Actor(int id, String nombre, String apellido, LocalDateTime fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        nuevo = false;
        modificado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public boolean isModificado() {
        return modificado;
    }

    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    public Actor(String nombre, String apellido, LocalDateTime fecha, boolean nuevo, boolean modificado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.nuevo = nuevo;
        this.modificado = modificado;
    }
}
