/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodiesel_higuerillaapp;

/**
 *
 * @author Ana Pico Solis
 */

class Biodiesel_Higuerilla {

    //Atributos
    private String operario;
    private double costo_extraccion;

    //Constructores
    public Biodiesel_Higuerilla(String operario){
        this(operario,0); //Sobrecarga
    }

    public Biodiesel_Higuerilla(String operario, double costo_extraccion){
        this.operario = operario;
        //Si la cantidad_dinero es menor que cero, le ponemos a cero.
        if (costo_extraccion < 0){
           this.costo_extraccion= 0;
        }  else {
              this.costo_extraccion= costo_extraccion;
        }
    }


    //Métodos
    public void setOperario(String titular){ //Set,  modifica o almacena el valor en la variable.
         this.operario= operario;
    }

    public String getOperario(){  //get, muestra o extrae el valor del dato.
       return operario;
    }

    public void setCosto_Extraccion (double costo_extraccion) {
          this.costo_extraccion= costo_extraccion;
    }

    public double getCosto_Extraccion(){
         return costo_extraccion;
    }

   /**
    * Ingersa dinero en la cuenta,
    * solo si es positovo la cantidad_dinero
    */

    public void Valor_Inicial (double costo_extraccion){
       if(costo_extraccion > 0){
           this.costo_extraccion += costo_extraccion;
       } //cantidad_dinero += cantidad_dinero+dinero

    }

    /**
     * Retira una cantidad_dinero de la cuenta, si se queddara en negativo
     * se quedaria en cero.
     */


    public void Valor_Final(double costo_extraccion){
        if (costo_extraccion< 0){
           this.costo_extraccion = costo_extraccion;
        } else{
           this.costo_extraccion -=costo_extraccion;
        }//cantidad_dinero =cantidad_dinero-cantidad_dinero
    }


    /**
     * Devuelve el estado del objeto
     *
     * @return
     */

    @Override
    public String toString(){
       return "El trabajo que realiza el operario de " + operario+" tiene " + costo_extraccion +
               " por cobrar. " ;
    }

}

//Clase ejecutable

public class Biodiesel_HiguerillaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Biodiesel_Higuerilla costo_1=new Biodiesel_Higuerilla("*Extracción y purificacación del Biodisel de Higuerilla*",1000);
        Biodiesel_Higuerilla costo_2=new Biodiesel_Higuerilla("*Extracción de Biodiesel de Higuerilla*", 300);

       //Ingreso de dinero en las cuentas
       costo_1.Valor_Inicial(200);
       costo_2.Valor_Inicial(100);


       //Retiro de dinero de las cuentas
       costo_1.Valor_Final(600);
       costo_2.Valor_Final(100);

       //Presentación de infromación de las cuentas
         System.out.println(costo_1);// 0 dólares
         System.out.println(costo_2); // 600 dólares
    }

}
