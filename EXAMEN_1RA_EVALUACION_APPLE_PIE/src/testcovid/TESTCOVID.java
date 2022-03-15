/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcovid;

/**
 *
 * @author Carlitoos
 */

   


public class TESTCOVID {
     public static void main(String[] args) {

         test_covid per1 = new test_covid();
         test_covid per2 = new test_covid();
         
         per1.setEdad(25);
         per1.setEstatura(1.70);
         per1.setPeso(65);
         per1.seteCronica("N");
         
         per2.setEdad(47);
         per2.setEstatura(1.50);
         per2.setPeso(78);
         per2.seteCronica("N");
         
         
         per1.calcularPersonaRiesgo();
         per2.calcularPersonaRiesgo();
         
        
    }
    
 
    
}

class test_covid {
int edad;
String eCronica;
int peso;
double estatura;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void seteCronica(String eCronica) {
        this.eCronica = eCronica;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public int getPeso() {
        return peso;
    }

    public String geteCronica() {
        return eCronica;
    }


    private double calcularIMC (){
     double x = peso / (Math.pow(estatura, 2));
        
      return x;
  }

    
    void calcularPersonaRiesgo(){
        
        if (calcularIMC()<31) {
            if (edad < 65) {
                if (eCronica == "N") {
                    System.out.println("PERSONA SIN RIESGO A TENER CORONAVIRUS");
                }else{
            System.out.println("PERSONA CON RIESGO A TENER CORONAVIRUS");}
            }else{
            System.out.println("PERSONA CON RIESGO A TENER CORONAVIRUS");}
        }else{
            System.out.println("PERSONA CON RIESGO A TENER CORONAVIRUS");}
        
    
    }

}
