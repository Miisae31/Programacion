import java.util.List;

public class Tienda {
    private String telefono;

    private String nombre;

    private String direccion;

    private String jefe;

    private String cif;

    private List<Empleado> empleados;

    private double dinero;

    public Tienda(String telefono, String nombre, String direccion, String jefe, String cif, List<Empleado> empleados, double dinero) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.direccion = direccion;
        this.jefe = jefe;
        this.cif = cif;
        this.empleados = empleados;
        this.dinero = dinero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}


