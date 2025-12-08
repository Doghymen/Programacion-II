/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgExamenFinal;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Doghymen
 */
public class Consultorio implements Serializable{

    private String consultas = "consultas.dat";
    private String medicos = "medicos.dat";

    // Cargando y guardando listas)
    private void guardarLista(String archivo, ArrayList lista) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
        oos.writeObject(lista);
        oos.close();
    }

    private ArrayList cargarLista(String archivo) throws Exception {
        File f = new File(archivo);
        if (!f.exists()) {
            return new ArrayList<>();
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
        ArrayList lista = (ArrayList) ois.readObject();
        ois.close();
        return lista;
    }

    // a)Creando medicos
    public void altaMedico(Medico m) throws Exception {
        ArrayList<Medico> meds = cargarLista(medicos);
        meds.add(m);
        guardarLista(medicos, meds);
    }

    // a) Creando las consultas de los medicos
    public void altaConsulta(Consulta c) throws Exception {
        ArrayList<Consulta> con = cargarLista(consultas);
        con.add(c);
        guardarLista(consultas, con);
    }

    // b) Eliminando medico
    public void bajaMedico(String nombre, String apellido) throws Exception {

        ArrayList<Medico> meds = cargarLista(medicos);
        ArrayList<Consulta> cons = cargarLista(consultas);

        int idEliminar = -1;

        // Buscar al médico a dar de baja (SIN foreach)
        for (int i = 0; i < meds.size(); i++) {
            Medico m = meds.get(i);

            if (m.getNombreMed().equals(nombre)
                    && m.getApellidoMed().equals(apellido)) {

                idEliminar = m.getIdMed();
                meds.remove(i);
                break;
            }
        }

        // Eliminar todas las consultas del médico eliminado
        for (int i = 0; i < cons.size(); i++) {
            if (cons.get(i).getIdMed() == idEliminar) {
                cons.remove(i);
                i--;
            }
        }

        guardarLista(medicos, meds);
        guardarLista(consultas, cons);
    }
    
    
    public void mostrarMedicos() throws Exception {
        ArrayList<Medico> meds = cargarLista(medicos);

        System.out.println("Lista medicos");
        for (int i = 0; i < meds.size(); i++) {
            System.out.println(meds.get(i));
        }
    }

    public void mostrarConsultas() throws Exception {
        ArrayList<Consulta> consultasList = cargarLista(consultas);

        System.out.println("Lista de consultas");
        for (int i = 0; i < consultasList.size(); i++) {
            System.out.println(consultasList.get(i));
        }
    }
}
