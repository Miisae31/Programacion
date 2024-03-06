package org.example;

public class Libro {
    private String firma;
    private String titulo;
    private String autor;
    private String editorial;
    private String ISBN;
    private int paginas;

    public Libro(String firma, String titulo, String autor, String editorial, String ISBN, int paginas) {
        this.firma = firma;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.paginas = paginas;
    }

    public String getFirma() {
        return firma;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String toString() {
        return "Firma: " + firma + "\n" +
               "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Editorial: " + editorial + "\n" +
               "ISBN: " + ISBN + "\n" +
               "Páginas: " + paginas;
    }

}
