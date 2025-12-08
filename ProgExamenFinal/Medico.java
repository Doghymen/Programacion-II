/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgExamenFinal;

import java.io.Serializable;

/**
 *
 * @author Doghymen
 */
public class Medico implements Serializable{

    private int idMed;
    private String nombreMed;
    private String apellidoMed;
    private int aniosExperiencia;

    public Medico(int idMed, String nombreMed, String apellidoMed, int aniosExperiencia) {
        this.idMed = idMed;
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getIdMed() {
        return idMed;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public String getApellidoMed() {
        return apellidoMed;
    }

    @Override
    public String toString() {
        return idMed + " - " + nombreMed + " " + apellidoMed + " (" + aniosExperiencia + " anios)";
    }
}
