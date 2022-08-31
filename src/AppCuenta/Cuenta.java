package AppCuenta;

/**
 * @author SARA_CRUZ
 */
public class Cuenta {
    //Atributos
    private String titular;
    private double cantidad;
    
    //Constructores
    public Cuenta(String titular){
        this.titular = titular;
        cantidad = 0;
    }
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        if(cantidad > 0){
            this.cantidad = cantidad;
        }else{
            this.cantidad = 0;
        }
    }
    
    //Getters y Setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    //Metodos especiales
    //Ingresando dinero a la cuenta solo con cantidades positivas
    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }
    
    //Retirando dinero de la cuenta
    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }
    
    //Metodo toString
    public String toString(){
        return "El titurlar " + titular + " dispone de " + cantidad + " dolares en la cuenta.";
    }
    
}
