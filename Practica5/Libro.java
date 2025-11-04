/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

/**
 *
 * @author Doghy
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Pagina[] paginas;
    private int paginasCont;
    
    public Libro(String titulo, String isbn, String[] contenidoPaginas){
        this.titulo = titulo;
        this.isbn = isbn;
        if (contenidoPaginas == null) {
            this.paginas = new Pagina[0];
            this.paginasCont = 0;
        } else{
            this.paginas = new Pagina[contenidoPaginas.length];
            this.paginasCont = contenidoPaginas.length;
            for (int i = 0; i < contenidoPaginas.length; i++) {
                this.paginas[i] = new Pagina(i + 1, contenidoPaginas[i]);
            }
        }
    }
    
    public void leer(){
        System.out.println("Leyendo libro:" + titulo + "ISBN: " + isbn);
        for (int i = 0; i < paginasCont; i++) {
            paginas[i].mostrarPagina();
        }
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }
}
