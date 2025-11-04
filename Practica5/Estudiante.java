/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica5;

/**
 *
 * @author Doghy
 */
public class Estudiante {
    private String codigo;
    private String nombre;
    
    public Estudiante(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void mostrarInfo(){
        System.out.println("Estudiante: " + nombre);
        System.out.println("Codigo: " + codigo);
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
}
