/* ITESS-TICS
   Agosto-Diciembre 2024
   EyOD
   Prof: Montecillo
   Programador: Nam_chul Bruno Vázquez Coronado
   Descripción:
   Fecha: 02/09/2024
*/
package minicurso.JF;
import java.util.*;

public class UnaClase {
    //modificador de acceso: public, private, protected, default
    private int numEntero;
    private float numFlotante;
    private double numD;
    //Constructores

    public UnaClase(int numEntero, float numFlotante, double numD) {
        this.numEntero = numEntero;
        this.numFlotante = numFlotante;
        this.numD = numD;
    }

    public UnaClase() {
    }
    
    //Getters y Setters
    
    public int getNumEntero() {
        return numEntero;
    }

    public void setNumEntero(int numEntero) {
        this.numEntero = numEntero;
    }

    public float getNumFlotante() {
        return numFlotante;
    }

    public void setNumFlotante(float numFlotante) {
        this.numFlotante = numFlotante;
    }

    public double getNumD() {
        return numD;
    }

    public void setNumD(double numD) {
        this.numD = numD;
    }

    @Override
    public String toString() {
        return "UnaClase{" + "numEntero=" + numEntero + ", numFlotante=" + numFlotante + ", numD=" + numD + '}';
    }
    
    
    
    
    private class OtraClase{
        
    }
}
