/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta_bancaria;

/**
 *
 * @author alox1
 */

class prueba{
    public static void main(String[] args) {
    CUENTA_BANCARIA cuen=new CUENTA_BANCARIA();
    cuen.setNumCuenta(1454562314);
    cuen.setNombre("Alex");
    cuen.setSaldo(100000);
    cuen.retirarDeCuenta(1000000000);
    cuen.imprimirDatos();
    }
}

public class CUENTA_BANCARIA {
    private long numCuenta;
    private String nombre;
    private double saldo;

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    CUENTA_BANCARIA(){
        numCuenta=0;
        nombre="";
        saldo=0;
    }
    
    void depositarEnCuenta(double valor){
        saldo+=valor;
    }
    
    void retirarDeCuenta(double valor){
        if (saldo>valor) {
            saldo-=valor;
            System.out.println("Se realizo con exito");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    void imprimirDatos(){
        System.out.println("Numero de cuenta: "+numCuenta);
        System.out.println("Nombre del cliente: "+nombre);
        System.out.println("Saldo total: "+saldo);
    }
    
}
