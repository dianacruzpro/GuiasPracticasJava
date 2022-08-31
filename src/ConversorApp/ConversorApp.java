/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ConversorApp;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;
/**
 *
 * @author SARA_CRUZ
 */
public class ConversorApp {
    public static void main (String[] args){
        int operacion;
        double temperatura;
        Scanner sc = new Scanner(System.in);
        
        try{
            do{
                System.out.println("************************************************************");
                System.out.println("*                 CONVERSOR DE TEMPERATURA                 *");
                System.out.println("************************************************************");
                System.out.println("Dame los grados a convertir: ");
                temperatura = sc.nextDouble();
                System.out.println("1. Celcius a Farenheit");
                System.out.println("2. Farenheit a Celcius \n");
                System.out.println("¿Que conversion quieres realizar?");
                operacion = sc.nextInt();
                
                switch(operacion){

                    case 1:
                        Temperatura temp1 = new Temperatura(temperatura);
                        temp1.convertirCeliusAFarenheit();
                        System.out.println(temp1);
                        break;
                    case 2:
                        Temperatura temp2 = new Temperatura(temperatura);
                        temp2.convertirFarenheitACelcius();
                        System.out.println(temp2);
                        break;
                    default:
                        System.out.println("La operacion no existe");
                        break;
                }
            }while(operacion == 1 || operacion == 2);
        }catch(Exception e){
            System.out.println("-------------------------------");
            System.out.println("  Se requiere un numero entero ");
            System.out.println("-------------------------------");
        }
    }
}
