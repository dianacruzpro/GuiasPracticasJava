package figura;
public class Figura {

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(); // creamos el objeto mediante su constructor
        System.out.println(triangulo1.toString()); //veremos que no tienen valor los atributos
        // el metodo toString nos permite ver los valores de los atributos
        triangulo1.setAltura(5); //seteamos valores con la ayuda de metodos
        triangulo1.setBase(6);
        System.out.println(triangulo1.toString()); //veremos que ahora si tienen valor los atributos
        System.out.println(triangulo1.calcularArea()); //llamamos al método calcularArea
        // que devuelva el area imprimiendola en pantalla
        //Ahora creamos un segundo objeto pero le pasamos en el contructor el valor de los atributos
        Triangulo triangulo2 = new Triangulo(7,8); // creamos el objeto mediante su constructor y argumentos
        System.out.println(triangulo2.toString());
        System.out.println(triangulo2.calcularArea()); //llamamos al método calcularArea
        // que devuelva el area imprimiendola en pantalla
    }
    
    
    
}
