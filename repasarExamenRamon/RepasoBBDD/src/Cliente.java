public class Cliente {
    private int id;
    private String nombre;
    private String apellido;

    private String tipo_doc;

    private String nro_doc;

    private String nro_tel_princ;

    private String nro_tel_sec;

    private String email;

    public Cliente(int id, String nombre, String apellido, String tipo_doc, String nro_doc, String nro_tel_princ, String nro_tel_sec, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_doc = tipo_doc;
        this.nro_doc = nro_doc;
        this.nro_tel_princ = nro_tel_princ;
        this.nro_tel_sec = nro_tel_sec;
        this.email = email;
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

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public String getNro_tel_princ() {
        return nro_tel_princ;
    }

    public void setNro_tel_princ(String nro_tel_princ) {
        this.nro_tel_princ = nro_tel_princ;
    }

    public String getNro_tel_sec() {
        return nro_tel_sec;
    }

    public void setNro_tel_sec(String nro_tel_sec) {
        this.nro_tel_sec = nro_tel_sec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente(" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipo_doc='" + tipo_doc + '\'' +
                ", nro_doc='" + nro_doc + '\'' +
                ", nro_tel_princ='" + nro_tel_princ + '\'' +
                ", nro_tel_sec='" + nro_tel_sec + '\'' +
                ", email='" + email + '\'' +
                ')';
    }
}
