package PromediosInterfaceApp;
/**
 * @author dsara
 */
public final class Operacion implements Estadistica{
    @Override
    public int promediar(int a[]){
        int prom;
        int sumatoria = 0;
        for (int i = 0; i < a.length; i++) {
            sumatoria += a[i];
        }
        prom = (sumatoria / a.length);
        return prom;
    }
    @Override
    public int sumar(int a[]){
        int sumarotia = 0;
        for (int i = 0; i < a.length; i++) {
            sumarotia += a[i];
        }
        return sumarotia;
    }
    @Override
    public double promediar(double a[]){
        double prom;
        double sumatoria = 0;
        for (int i = 0; i < a.length; i++) {
            sumatoria += a[i];
        }
        prom = (sumatoria / a.length);
        return prom;
    }
    @Override
    public double sumar(double a[]){
        double sumarotia = 0;
        for (int i = 0; i < a.length; i++) {
            sumarotia += a[i];
        }
        return sumarotia;
    }
}
