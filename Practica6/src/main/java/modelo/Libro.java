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
public class Libro {

    private String titulo;
    private String isbn;
    private ArrayList<Pagina> paginas;

    public Libro(String titulo, String isbn, ArrayList<Pagina> paginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }
    

    public ArrayList<Pagina> getPaginas() {
        return paginas;
    }
    

    public void leer() {
        for (Pagina p : paginas) {
            p.mostrarContenido();
        }
    }

    @Override
    public String toString() {
        return titulo + " (ISBN: " + isbn + ")";
    }
}
