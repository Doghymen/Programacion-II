/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgExamenFinal;

/**
 *
 * @author Doghymen
 */
public class Principal {

    public static void main(String[] args) {
        try {
            Consultorio consulta = new Consultorio();

            // a)
            consulta.altaMedico(new Medico(1, "Juan", "Perez", 10));
            consulta.altaMedico(new Medico(2, "Maria", "Lopez", 7));
            consulta.altaMedico(new Medico(3, "Carlos", "Gomez", 12));

            consulta.altaConsulta(new Consulta(1001, "Luis", "Rojas", 1, 25, "Diciembre", 2024));
            consulta.altaConsulta(new Consulta(1002, "Ana", "Mendez", 2, 1, "Enero", 2024));
            consulta.altaConsulta(new Consulta(1003, "Jose", "Salas", 3, 10, "Marzo", 2024));

            consulta.altaConsulta(new Consulta(1004, "Maria", "Vega", 1, 5, "Junio", 2024));
            consulta.altaConsulta(new Consulta(1005, "Pedro", "Flores", 2, 25, "Diciembre", 2024));
            consulta.altaConsulta(new Consulta(1006, "Lucia", "Rivera", 3, 7, "Julio", 2024));

            consulta.altaConsulta(new Consulta(1007, "Carmen", "Luna", 1, 1, "Enero", 2024));
            consulta.altaConsulta(new Consulta(1008, "Miguel", "Soto", 2, 12, "Agosto", 2024));
            consulta.altaConsulta(new Consulta(1009, "Andrea", "Paz", 3, 30, "Abril", 2024));

            
            consulta.mostrarMedicos();
            consulta.mostrarConsultas();
            
            
            System.out.println("====================================================");
            System.out.println("==== ELIMINANDO MEDICO X Y SUS CONSULTAS ===========");
            System.out.println("====================================================");
            consulta.bajaMedico("Maria", "Lopez");
            consulta.bajaMedico("Carlos", "Perez");

            consulta.mostrarMedicos();
            consulta.mostrarConsultas();


            System.out.println("====================================================");
            System.out.println("==== CAMBIANDO FECHAS ESPECIALES ===========");
            System.out.println("====================================================");
            con.cambiarFechasEspeciales();
            consulta.mostrarMedicos();
            consulta.mostrarConsultas();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

