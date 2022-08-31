/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConversorApp;

/**
 *
 * @author SARA_CRUZ
 */
public class Temperatura {
    //atributos
    private double temperatura;
    public double resultado;
    
    //Constructores
    public Temperatura(){
        this.temperatura = 0;
    }
    
    public Temperatura(double temp){
        this.temperatura = temp;
    }
    
    //Metodos

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    //Metodos especiales
    public void convertirCeliusAFarenheit(){
        resultado = (this.temperatura * 1.8) + 32;
    }
    
    public void convertirFarenheitACelcius(){
        resultado = (this.temperatura - 32) / 1.8;
    }
    
    //Metodo toString
    public String toString(){
        return "La converción es de " + resultado + " grados";
    }
    
}
