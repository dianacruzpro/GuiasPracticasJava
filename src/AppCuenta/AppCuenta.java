/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppCuenta;

/**
 *
 * @author SARA_CRUZ
 */
public class AppCuenta {
    public static void main (String[] args){
        Cuenta c1 = new Cuenta("Diana");
        Cuenta c2 = new Cuenta("Sara", 1200);
        Cuenta c3 = new Cuenta("Cristina", 150);
        
        //Ingresando a las cuentas
        c1.ingresar(950);
        c2.ingresar(150);
        
        //Retirando de las cuentas
        c1.retirar(50);
        c2.retirar(300);
        c3.retirar(200);
        
        //Mostrando información
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
