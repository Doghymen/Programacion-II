/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Doghy
 */
class Biblioteca {

    private String nombre;
    private List<Libro> librosDisponibles;
    private List<Autor> autoresRegistrados;
    private List<Prestamo> prestamosActivos;
    private Horario horario;

    public Biblioteca(String nombre, String diasApertura, String horaApertura, String horaCierre) {
        this.nombre = nombre;
        this.librosDisponibles = new ArrayList<>();
        this.autoresRegistrados = new ArrayList<>();
        this.prestamosActivos = new ArrayList<>();
        this.horario = new Horario(diasApertura, horaApertura, horaCierre);
    }

    public Biblioteca(String nombre, String diasApertura, String apertura, String cierre, boolean dummy) {
        this(nombre, diasApertura, apertura, cierre);
    }

    public void agregarLibro(Libro libro) {
        if (libro != null && !librosDisponibles.contains(libro)) {
            librosDisponibles.add(libro);
            System.out.println("Libro agregado a la biblioteca: " + libro.getTitulo());
        }
    }

    public void agregarAutor(Autor autor) {
        if (autor != null && !autoresRegistrados.contains(autor)) {
            autoresRegistrados.add(autor);
            System.out.println("Autor registrado en la biblioteca: " + autor.getNombre());
        }
    }

    public void prestarLibro(Estudiante estudiante, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        if (!librosDisponibles.contains(libro)) {
            System.out.println("Error: El libro no esta disponible en esta biblioteca.");
            return;
        }
        Prestamo p = new Prestamo(estudiante, libro, fechaPrestamo, fechaDevolucion);
        prestamosActivos.add(p);
        System.out.println("Prestamo creado: " + estudiante.getNombre() + ": " + libro.getTitulo());
    }

    public void mostrarEstado() {
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Horario:");
        horario.mostrarHorario();
        System.out.println("Autores registrados (" + autoresRegistrados.size() + "):");
        for (Autor a : autoresRegistrados) {
            a.mostrarInfo();
        }
        System.out.println("Libros disponibles (" + librosDisponibles.size() + "):");
        for (Libro l : librosDisponibles) {
            System.out.println("- " + l.getTitulo() + " (ISBN: " + l.getIsbn() + ")");
        }
        System.out.println("Prestamos activos (" + prestamosActivos.size() + "):");
        for (Prestamo pr : prestamosActivos) {
            pr.mostrarInfo();
        }
    }

    public void cerrarBiblioteca() {
        System.out.println("La biblioteca " + nombre + " esta cerrando. Todos los prestamos seran eliminados.");
        prestamosActivos.clear();
    }

    public class Horario {

        private String diasApertura;
        private String horaApertura;
        private String horaCierre;

        public Horario(String diasApertura, String horaApertura, String horaCierre) {
            this.diasApertura = diasApertura;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }

        public void mostrarHorario() {
            System.out.println("Dias: " + diasApertura + ", Apertura: " + horaApertura + ", Cierre: " + horaCierre);
        }
    }
}
