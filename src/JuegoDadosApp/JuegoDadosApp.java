package JuegoDadosApp;
import java.util.Scanner;
public class JuegoDadosApp {
    public static void main (String []args){
        var opcion = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("\n1. Juego de dados");
                System.out.println("0. Salir");
                System.out.println("Introduzca una opción: ");
                opcion = sc.nextInt();
                if (opcion == 1) {
                JuegoDeDados partida= new JuegoDeDados();
                partida.iniciar();
                partida.jugar();
                partida.finalizar();
                }
            } catch (Exception ex) {
                System.out.println("Dato no valido");
            }
        } while (opcion == 1);
    }
    
}
