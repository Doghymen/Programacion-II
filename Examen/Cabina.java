/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author Doghymen
 */
public class Cabina {

    private int nroCabina;
    private Persona[] personasAbordo;
    private int contador;
    private final double peso_max = 850;

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
    }

    public boolean agregarPersona(Persona p) {
        if (contador >= 10) {
            System.out.println("Cabina llena.");
            return false;
        }

        double pesoActual = 0;
        for (int i = 0; i < contador; i++) {
            pesoActual += personasAbordo[i].getPesoPersona();
        }

        if (pesoActual + p.getPesoPersona() > peso_max) {
            System.out.println("El peso es mayor a 850kg.");
            return false;
        }

        personasAbordo[contador] = p;
        contador++;
        System.out.println("Persona agregada: " + p);
        return true;
    }
}
