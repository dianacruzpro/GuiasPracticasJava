package FiguraHerencia;
public class Triangulo extends Figura{
    private double lado;
    public Triangulo(){
    }
    public Triangulo(double lado){
        this.lado=lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double calcularArea(){
        return (this.lado*this.lado)/2;
    }
    @Override
    public String toString() {
        return "Triangulo{" + "lado=" + lado + '}';
    }
}
