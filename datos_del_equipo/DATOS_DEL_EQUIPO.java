/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos_del_equipo;

/**
 *
 * @author alox1
 */

class prueba{
    public static void main(String[] args) {
    DATOS_DEL_EQUIPO.numerodecontrol = "21550339 ";
    DATOS_DEL_EQUIPO.nombres = "Daniel Alejandro ";
    DATOS_DEL_EQUIPO.apellidos = "Gonzalez Gutierrez ";
    DATOS_DEL_EQUIPO.carrera = "Ingenieria en sistemas computacionales ";
    DATOS_DEL_EQUIPO.ImpDatosEquipo();
    DATOS_DEL_EQUIPO.numerodecontrol = "21550305 ";
    DATOS_DEL_EQUIPO.nombres = "Manuel Alejandro ";
    DATOS_DEL_EQUIPO.apellidos = "Urquidi Aguilar ";
    DATOS_DEL_EQUIPO.carrera = "Ingenieria en sistemas computacionales ";
    DATOS_DEL_EQUIPO.ImpDatosEquipo();
    DATOS_DEL_EQUIPO.numerodecontrol = "21550328 ";
    DATOS_DEL_EQUIPO.nombres = "Carlos Alexis ";
    DATOS_DEL_EQUIPO.apellidos = "Gonzalez Estrada ";
    DATOS_DEL_EQUIPO.carrera = "Ingenieria en sistemas computacionales ";
    DATOS_DEL_EQUIPO.ImpDatosEquipo();
    DATOS_DEL_EQUIPO.ImpProblemasResueltos();
    }
}

public class DATOS_DEL_EQUIPO {
    static String numerodecontrol;
    static String nombres;
    static String apellidos;
    static String carrera;

    static void ImpDatosEquipo (){
    System.out.println("Numero de control: " + numerodecontrol);
    System.out.println("Nombre: " + nombres);
    System.out.println("Apellidos : " + apellidos);
    System.out.println("Carrera: " + carrera);
    }
    static void ImpProblemasResueltos() {
    System.out.println("PROBLEMAS RESUELTOS:");
    System.out.println("Clase datos del equipo. Valor 15pts");
    System.out.println("Clase test covid. Valor 30pts");
    System.out.println("Clase cuenta bancaria. Valor 30pts");
    System.out.println("Clase empleado. Valor 30pts");
    System.out.println("Clase Fibonacci. Valor 50pts");
    }
}
