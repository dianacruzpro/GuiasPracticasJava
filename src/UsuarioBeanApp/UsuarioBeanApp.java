package UsuarioBeanApp;
import java.util.Date;
/**
 * @author dsara
 */
public class UsuarioBeanApp {
    public static void main(String[] args) {
        UsuarioBean usuario1= new UsuarioBean();
        Date fecha= new Date();
        usuario1.setNombre("Diana Cruz");
        usuario1.setVaron(false);
        usuario1.setUltimaVisita(fecha);
        usuario1.setVisitas(11);
        System.out.println("El nombre del usuario es: "+usuario1.getNombre());
        System.out.println("¿Es varón?: "+(usuario1.isVaron()? "Si":"No"));
        System.out.println("La ultima visita del usuario: "+usuario1.getUltimaVisita());
        System.out.println("El número de visita del usuario: "+usuario1.getVisitas());
    }
}
