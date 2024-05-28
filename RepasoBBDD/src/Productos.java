import javax.print.DocFlavor;

public class Productos {
    private int id;
    private int id_proveedor;

    private String codigo;

    private String imagen;

    private String nombre;
    private String marca;

    private String tipo;

    private String grupo;

    private Double peso;

    private Double precio_unidad;

    private int stock;

    public Productos(int id, int id_proveedor, String codigo, String imagen, String nombre, String marca, String tipo, String grupo, Double peso, Double precio_unidad, int stock) {
        this.id = id;
        this.id_proveedor = id_proveedor;
        this.codigo = codigo;
        this.imagen = imagen;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.grupo = grupo;
        this.peso = peso;
        this.precio_unidad = precio_unidad;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(Double precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", id_proveedor=" + id_proveedor +
                ", codigo='" + codigo + '\'' +
                ", imagen='" + imagen + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", grupo='" + grupo + '\'' +
                ", peso=" + peso +
                ", precio_unidad=" + precio_unidad +
                ", stock=" + stock +
                '}';
    }
}