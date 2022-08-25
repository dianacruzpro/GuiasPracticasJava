package FiguraHerencia;
public class Cuadrado extends Figura{
    private double lado;
    public Cuadrado(){
    }
    public Cuadrado(double lado){
        this.lado=lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double calcularArea(){
        return this.lado*this.lado;
    }
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
}
