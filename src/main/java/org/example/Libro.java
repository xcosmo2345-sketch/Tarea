package org.example;

public class Libro {

    private String titulo;
    private String codigoLibro;
    private boolean disponible;
    private Autor autor;

    public Libro(String titulo, String codigoLibro, Autor autor) {
        this.titulo = titulo;
        this.codigoLibro = codigoLibro;
        this.autor = autor;
        this.disponible = true;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String mostrarInfo() {
        return " Libro " + titulo + " | Código: " + codigoLibro +
                " | Autor: " + autor.getNombre() +
                " | " + (disponible ? "Disponible" : " Prestado");
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true; // Préstamo exitoso
        }
        return false; // No disponible
    }

    public void devolver() {
        disponible = true;
    }
}
