/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author Doghymen
 */
public class Persona {

    private String nombre;
    private int edad;
    private float pesoPersona;

    public Persona(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.pesoPersona = peso;
    }

    public String toString() {
        return "Nombre => " + nombre + ", Edad => " + edad + ", Peso => " + pesoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getPesoPersona() {
        return pesoPersona;
    }
}
