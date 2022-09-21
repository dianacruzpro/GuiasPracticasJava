package PromediosInterfaceApp;
/**
 * @author dsara
 */
public class PromApp {
    public static void main (String []args){
        Operacion op = new Operacion();
        int p[] = new int[10];
        for (int i = 0; i < p.length; i++) {
            p[i] = (int) (100*Math.random()*1);
            System.out.println("Posicion[" + i + "] = " + p[i]);
        }
        System.out.println("Suma total: " + op.sumar(p));
        System.out.println("El promedio es : " + op.promediar(p));
    }
}
