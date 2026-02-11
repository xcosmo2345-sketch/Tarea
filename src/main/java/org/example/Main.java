package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("J.K. Rowling", "Británica");

        Libro libro1 = autor1.escribirLibro("Cien años de soledad", "25");
        Libro libro2 = autor2.escribirLibro("Harry Potter y la piedra filosofal", "78");

        libroEspecial libro3 = new libroEspecial(
                "El Quijote", "340",
                new Autor("Miguel de Cervantes", "Española"), "Primera edición",
                true
        );

        System.out.println("LIBROS REGISTRADOS:");
        System.out.println(libro1.mostrarInfo());
        System.out.println(libro2.mostrarInfo());
        System.out.println(libro3.mostrarInfo());

        System.out.println("\nSIMULACION DE PRESTAMO:");
        System.out.print("Prestamo de " + libro1.getTitulo() + "': ");

        if (libro1.prestar()) {
            System.out.println("Exitoso");
        } else {
            System.out.println("Fallido");
        }
        System.out.println(libro1.mostrarInfo());

        System.out.println("Devolviendo libro  ");
        libro1.devolver();
        System.out.println(libro1.mostrarInfo());

        System.out.println("\nLIBRO ESPECIAL:");
        System.out.println(" Es coleccionable " + libro3.esColeccionable());

        System.out.println("\nPOLIMORFISMO:");
        Libro[] libros = { libro1, libro2, libro3 };
        for (Libro l : libros) {
            System.out.println(l.mostrarInfo());
            if (l instanceof libroEspecial) {
                libroEspecial le = (libroEspecial) l;
                System.out.println(" Coleccionable " + le.esColeccionable());
            }
        }

    }
}