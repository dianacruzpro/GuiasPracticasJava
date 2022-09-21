package MatesInterface;
public class Mate2App {
    public static void main (String []args){
        //Instanciando la clase Mate2 para emplear los metodos
        Mate2 mate = new Mate2();
        //Creando el arreglo con 10 posiciones
        int p[] = new int[10];
        for (int i = 0; i < p.length; i++) {
            p[i] = (int) (100*Math.random()*1);
            System.out.println("Posicion[" + i + "] = " + p[i]);
        }
        System.out.println("Minimo = " + mate.min(p));
        System.out.println("Maximo = " + mate.max(p));
    }
}
