package FiguraHerencia;
public class FiguraHerencia {
    public static void main(String[] args){
        //Creando un objeto de la clase padre
        Figura figura1= new Figura(3,4);
        System.out.println(figura1.toString());
        //Creando objeto con herencia
        Triangulo triangulo1= new Triangulo();
        triangulo1.setAltura(3);
        triangulo1.setBase(9);
        System.out.println(triangulo1.toString()); // metodo heredado sobrescrito
        System.out.println(triangulo1.calcularArea()); // metodo heredado sobreescrito
        //System.out.println(triangulo1.mostrarHerencia()); //metodo heredado del padre declarado en el hijo
        
        //Creando objeto con herencia
        Cuadrado cuadrado1= new Cuadrado();        cuadrado1.setLado(3);
        System.out.println(cuadrado1.toString()); // metodo heredado sobrescrito
        
        
        System.out.println(cuadrado1.calcularArea()); // metodo heredado sobreescrito
        //System.out.println(cuadrado1.mostrarHerencia()); //metodo heredado del padre declarado en el hijo
    }
}
