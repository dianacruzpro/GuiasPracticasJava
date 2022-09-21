package JuegoDadosApp;
import java.util.Scanner;
/**
 * @author dsara
 */
public class JuegoDeDados implements Juego{
    private int dado1, dado2;
    private String jugador1;
    private String jugador2;
    private Scanner teclado;
    public JuegoDeDados() {
        teclado = new Scanner(System.in);
    }
    public void iniciar() {
        System.out.print("Ingrese el nombre del primer jugador:");
        jugador1 = teclado.nextLine();
        System.out.print("Ingrese el nombre del segundo jugador:");
        jugador2 = teclado.nextLine();
    }
    public void jugar() {
        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        System.out.println(jugador1 + " le salió el valor " + dado1);
        System.out.println(jugador2 + " le salió el valor " + dado2);
    }
    public void finalizar() {
        if (dado1 > dado2)
        System.out.println("Gano " + jugador1 + " con un valor de " + dado1);
        else if (dado2 > dado1)
        System.out.println("Gano " + jugador2 + " con un valor de " + dado2);
        else
        System.out.println("Empataron los dos jugadores con el valor " + dado1);
    }
}
