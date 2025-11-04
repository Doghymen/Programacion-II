/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

/**
 *
 * @author Doghy
 */
public class Prestamo {

    private String fechaPrestamo;
    private String fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro, String fechaPrestamo, String fechaDevolucion) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void mostrarInfo() {
        System.out.println("Prestamo Estudiante: " + estudiante.getNombre());
        System.out.println("Libro Prestado: " + libro.getTitulo());
        System.out.println("Fecha prestamo: " + fechaPrestamo);
        System.out.println("Fecha devolucion: " + fechaDevolucion);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Libro getLibro() {
        return libro;
    }
}
