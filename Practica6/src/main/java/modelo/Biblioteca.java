/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Doghymen
 */
public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario("Lunes a Viernes", "08:00", "18:00");
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void prestarLibro(Estudiante est, Libro libro) {
        Prestamo p = new Prestamo(est, libro);
        prestamos.add(p);
    }
}
