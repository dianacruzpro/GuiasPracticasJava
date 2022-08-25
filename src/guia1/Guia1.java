package guia1;
import java.util.Scanner;
public class Guia1 {
    public static void main(String[] args) {
        int ejercicio;
        Scanner sc = new Scanner(System.in);
        try{
            do{
            System.out.println("###########################################################");
            System.out.println("                    GUIA DE EJERCICIOS 1                   ");
            System.out.println("###########################################################\n");
            System.out.println("1. Calculadora de indice de masa corporal");
            System.out.println("2. Juego de adivinanza");
            System.out.println("3. Saber si el anio es bisiesto");
            System.out.println("4. Salir\n");
            System.out.println("Que ejercicio quieres ver: ");
            ejercicio = sc.nextInt();
            
            switch(ejercicio){
                case 1 -> {
                    double peso, altura, imc;
                    int accion;
                    try{
                        do{
                            System.out.println("|----------------------------------------|");
                            System.out.println("|----- Calculadora de peso corporal -----|");
                            System.out.println("|----------------------------------------|");
                            System.out.println("1. Hacer calculo");
                            System.out.println("2. Salir");
                            System.out.println("Seleccione una opción: ");
                            Scanner entrada = new Scanner(System.in);
                            accion = entrada.nextInt();

                            try{
                                if(accion == 1){
                                    Scanner entrada2 = new Scanner(System.in);
                                    System.out.println("\n\nIngrese su peso en 'Kg'");
                                    peso = entrada2.nextDouble();
                                    System.out.println("Ingrese su altura en 'm'");
                                    altura = entrada2.nextDouble();

                                    imc = (peso/(altura*altura));

                                    System.out.println("################################### RESULTADOS ##################################");
                                    System.out.println("Su peso corporal es de: " + peso +" Kg");
                                    System.out.println("Su altura es de: "+ altura +" m");
                                    System.out.println("Su indice de masa corporal es de: "+ imc);

                                    if(imc < 16){
                                        System.out.println("Diagnostico: Criterio de ingreso al hospital \n\n");
                                    }else if(imc == 16){
                                        System.out.println("Diagnostico: Infrapeso \n\n");
                                    }else if(imc == 18){
                                        System.out.println("Diagnostico: Bajo peso \n\n");
                                    }else if(imc > 18 && imc <= 25){
                                        System.out.println("Diagnostico: Peso normal (saludable)\n\n");
                                    }else if(imc > 25 && imc <= 30){
                                        System.out.println("Diagnostico: Sobrepeso (obesidad de grado I) \n\n");
                                    }else if(imc > 30 && imc <= 35){
                                        System.out.println("Diagnostico: Sobrepeso crónico (obesidad de grado II) \n\n");
                                    }else if(imc > 35 && imc <= 40){
                                        System.out.println("Diagnostico: Obesidad premórbida (obesidad de grado III) \n\n");
                                    }else{
                                        System.out.println("Diagnostico: Obesidad mórbida (obesidad de grado IV) \n\n");
                                    }
                                }
                            }catch(Exception e){
                                System.out.println("****************************************");
                                System.out.println("   El valor debe ser entero o decimal   ");
                                System.out.println("**************************************** \n\n");
                            }
                        }while(accion == 1);
                    }catch(Exception e){
                        System.out.println("***************************************");
                        System.out.println("      Se requiere un valor entero      ");
                        System.out.println("***************************************");
                    }
                }
                case 2 -> {
                    try{
                        int action;
                        do{
                            Scanner entrada = new Scanner(System.in);
                            System.out.println("*********************************");
                            System.out.println("        Juego de adivinanza      ");
                            System.out.println("*********************************");
                            System.out.println("1. Jugar");
                            System.out.println("2. Salir \n");
                            System.out.println("Que deseas hacer: ");
                            action = entrada.nextInt();
                            if(action == 1){
                                int num, x;
                                boolean acertado = false;
                                int intentos = 10;

                                x = (int)(20*Math.random()+1);

                                Scanner sc2 = new Scanner(System.in);
                                try{
                                    do{
                                        System.out.println("\nIntentos restantes: " + intentos);
                                        System.out.println("Adivina el numero entre 1 y 20: ");
                                        num = sc2.nextInt();
                                        intentos--;
                                        if(num == x){
                                            acertado = true;
                                        }else if(num < x){
                                            System.out.println("El numero debe ser mayor");
                                        }else{
                                            System.out.println("El numero debe ser menor");
                                        }
                                    }while(intentos > 0 && !acertado);

                                    if(acertado){
                                        System.out.println(" GENIAL!! Adivinaste el numero!! \n\n");
                                    }else{
                                        System.out.println("Se te acabaron los intentos, el numero era: "+ x +"\n\n");
                                    }
                                }catch(Exception e){
                                    System.out.println("----------------------------------------------");
                                    System.out.println("  Se requiere un numero entero para adivinar  ");
                                    System.out.println("---------------------------------------------- \n\n");
                                }
                            }
                        }while(action == 1);
                    }catch(Exception e){
                        System.out.println("--------------------------------");
                        System.out.println("  Se requiere un numero entero  ");
                        System.out.println("-------------------------------- \n\n");
                    }
                }
                case 3 -> {
                    int anio;
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Dame un anio para determinar si es bisiesto o no: ");
                    anio = sc3.nextInt();

                    if( ((anio%4 == 0) && (anio%100 != 0)) || anio%400 == 0 ){
                        System.out.println("El anio es bisiesto");
                    }else{
                        System.out.println("El anio NO es bisiesto");
                    }
                }
                default -> {
                        break;
                }
            }
            
            }while(ejercicio == 1 || ejercicio == 2 || ejercicio == 3);
        }catch(Exception e){
            System.out.println("-------------------------------");
            System.out.println("  Se requiere un numero entero ");
            System.out.println("-------------------------------");
        }
    }
    
}
