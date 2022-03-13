/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;
import java.util.Scanner;

/**
 *
 * @author alox1
 */

class prueba{
    public static void main(String[] args) {
        // TODO code application logic here
        int a1,a2,n;
        Scanner leer=new Scanner(System.in);
        FIBONACCI fib=new FIBONACCI();
        fib.ImprSerie();
        
        System.out.println("ingrese el valor a1: ");
        a1=leer.nextInt();
        System.out.println("ingrese el valor a2: ");
        a2=leer.nextInt();
        System.out.println("ingrese el valor n: ");
        n=leer.nextInt();
        
        FIBONACCI fibUsua=new FIBONACCI(a1,a2,n);
        fibUsua.ImprSerie();
    }
}

public class FIBONACCI {
    
    private int a1,a2,n;

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    FIBONACCI(){
        a1=1;
        a2=1;
        n=6;
    }
    
    FIBONACCI(int a1,int a2,int n){
      this.a1=a1;
      this.a2=a2;
      this.n=n;
    }
    
    void ImprSerie(){
        System.out.println("Serie fibonacci, "
                + "valores de a1= "+a1+", a2= "+a2+", n= "+n);
        System.out.print(a1+"\t");
        for (int i = 0; i < n; i++) {
            System.out.print(a2 +"\t");
            a2+=a1;
            a1=a2-a1;
        }
        System.out.println();
    }
    
}
