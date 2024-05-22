import java.time.LocalDate;

public class Cliente {
    private String id;
    private String nombre;

    private double dinero;

    private LocalDate fechaNacimiento;

    public Cliente(String id, String nombre, double dinero, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.dinero = dinero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
