package org.example;

public class libroEspecial extends Libro {

    private String tipo;
    private boolean edicionLimitada;

    public libroEspecial(String titulo, String codigoLibro, Autor autor,
                         String tipo, boolean edicionLimitada) {
        super(titulo, codigoLibro, autor); // Llamada al constructor de Libro
        this.tipo = tipo;
        this.edicionLimitada = edicionLimitada;
    }
    public boolean esColeccionable() {
        return edicionLimitada || tipo.equalsIgnoreCase("Primera edición");

    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " | Tipo: " + tipo +
                (edicionLimitada ? " (Edición limitada)" : "");
    }
}
