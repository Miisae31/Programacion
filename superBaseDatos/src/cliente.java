public class cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String tipo_doc;
    private String nro_doc;
    private String Nro_tel_princ;

    public cliente(int id, String nombre, String apellido, String tipo_doc, String nro_doc, String tel_princ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_doc = tipo_doc;
        this.nro_doc = nro_doc;
        this.Nro_tel_princ = Nro_tel_princ;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public  String getApellido() {
        return apellido;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public String getNro_tel_princ() {
        return Nro_tel_princ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public void setTel_princ(String tel_princ) {
        this.Nro_tel_princ = tel_princ;
    }
}
