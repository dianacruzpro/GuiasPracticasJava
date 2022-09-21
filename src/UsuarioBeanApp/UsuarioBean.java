package UsuarioBeanApp;
import java.util.Date;
/**
 * @author dsara
 */
public class UsuarioBean {
    //variables miembro, privadas
    private String nombre;
    private int visitas;
    private Date ultimaVisita;
    private boolean varon;
    //constructor sin argumentos
    public UsuarioBean() {
        nombre = null;
        visitas = 0;
        ultimaVisita = null;
        varon = false;
    }
    //métodos de acceso: getXXX, isXXX
    public String getNombre() {
        return nombre;
    }
    public int getVisitas() {
        return visitas;
    }
    public Date getUltimaVisita() {
        return ultimaVisita;
    }
    public boolean isVaron() {
        return varon;
    }
    //métodos de cambio de valor: setXXX
    public void setNombre(String nom) {
        nombre = nom;
    }
    public void setVisitas(int v) {
        visitas = v;
    }
    public void setUltimaVisita(Date fecha) {
        ultimaVisita = fecha;
    }
    public void setVaron(boolean valor) {
        varon = valor;
    }
}
