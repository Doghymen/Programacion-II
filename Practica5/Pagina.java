/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

/**
 *
 * @author Doghy
 */
public class Pagina {

    private int numeroPagina;
    private String contenido;

    Pagina(int numeroPagina, String contenido) {
        this.numeroPagina = numeroPagina;
        this.contenido = contenido;
    }

    public void mostrarPagina() {
        System.out.println("Pagina " + numeroPagina + ": " + contenido);
    }

    public void mostrarHorario() {
        mostrarPagina();
    }
}
