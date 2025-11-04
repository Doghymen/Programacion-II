/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

/**
 *
 * @author Doghy
 */
public class Principal {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("Jorge Luis Borges", "El Alto");
        Autor autor2 = new Autor("Octavio Paz", "La Paz");

        
        String[] contenidoLibro1 = new String[] {
            "Pagina 1 - Contenido inicial de 'Ficciones'",
            "Pagina 2 - Continuacion",
            "Pagina 3 - Fin."
        };
        Libro libro1 = new Libro("Ficciones (extracto)", "ISBN-1001", contenidoLibro1);

        String[] contenidoLibro2 = new String[] {
            "Pagina 1 - Fragmento de 'El Laberinto de la Soledad'...",
            "Pagina 2 - Continuación del fragmento..."
        };
        Libro libro2 = new Libro("El Laberinto", "ISBN-1002", contenidoLibro2);

        
        Biblioteca biblioteca = new Biblioteca("Biblioteca UMSA",
                "Lunes a Viernes", "08:00", "18:00");

        biblioteca.agregarAutor(autor1);
        biblioteca.agregarAutor(autor2);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        
        biblioteca.mostrarEstado();

        
        
        Estudiante estudiante = new Estudiante("2025-0001", "Ana Gomez");


        
        String fechaPrestamo = "2025-11-02";
        String fechaDevolucion = "2025-11-16";
        biblioteca.prestarLibro(estudiante, libro1, fechaPrestamo, fechaDevolucion);

        
        
        biblioteca.mostrarEstado();

        
        
        System.out.println("\n Leer libro prestado (demostracion de COMPOSICION Libro con pagina) ---");
        libro1.leer();


        
        System.out.println("\n Cerrando biblioteca (los pstamos se eliminan)");
        biblioteca.cerrarBiblioteca();

        
        biblioteca.mostrarEstado();

        System.out.println("\n Comprobacion: Objetos Libro y Autor siguen existiendo fuera de Biblioteca ---");
        System.out.println("Libro fuera de biblioteca: " + libro2.getTitulo() + " (ISBN: " + libro2.getIsbn() + ")");
        autor2.mostrarInfo();

        
    }
}
