/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Doghymen
 */
public class Horario {

    private String dias;
    private String horaApertura;
    private String horaCierre;

    public Horario(String dias, String apertura, String cierre) {
        this.dias = dias;
        this.horaApertura = apertura;
        this.horaCierre = cierre;
    }

    public void mostrarHorario() {
        System.out.println(dias + " / " + horaApertura + " - " + horaCierre);
    }
}
