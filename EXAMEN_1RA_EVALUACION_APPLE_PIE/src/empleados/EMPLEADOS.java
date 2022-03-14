/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author alox1
 */

class prueba{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, apellido, direccion;
        int añoIngreso;
        double salario;
        
        System.out.println("Ingrese nombre:");
        nombre=leer.nextLine();
        System.out.println("Ingrese apellido:");
        apellido=leer.nextLine();
        System.out.println("Ingrese direccion:");
        direccion=leer.nextLine();
        System.out.println("Ingrese año de ingreso:");
        añoIngreso=leer.nextInt();
        System.out.println("Ingrese salario:");
        salario=leer.nextDouble();
        
        EMPLEADOS emp1=new EMPLEADOS();
        emp1.imprimirDatos();
        EMPLEADOS emp2=new EMPLEADOS(nombre,apellido,direccion,añoIngreso,salario);
        emp2.imprimirDatos();
    }
}

public class EMPLEADOS {
    Date dt=new Date();
    
    private String nombre, apellido, direccion;
    private int añoIngreso;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    EMPLEADOS(){
        System.out.println("Creacion del empleado 1");
        nombre="Alex";
        apellido="Urquidi";
        direccion="Cuahutemoc 14";
        añoIngreso=2015;
        salario=1000;
    }
    
    EMPLEADOS(String nombre, String apellido, String direccion, int añoIngreso, double salario){
        System.out.println("Creacion del empleado 2");
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.añoIngreso=añoIngreso;
        this.salario=salario;
    }
    
    int calcularVacaciones(){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        int diasVaca=6;
        int cinAños=(2022 - añoIngreso)/5;
        formato1.format(cinAños);
        cinAños=cinAños*2;
        diasVaca+=cinAños;
        for (int i = añoIngreso; i < 2022; i++) {
            diasVaca+=2;
        }
        return diasVaca;
    }
    
    void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Direccion: "+direccion);
        System.out.println("Año de ingreso: "+añoIngreso);
        System.out.println("Salario: "+salario);
        System.out.println("Dias de vacaciones: "+calcularVacaciones());
    }
    
}
