
package Fundamentos;

public class EDAlgoTP02 {
    
}
class SalarioPorComision{
    private int[] ventas;
    private int[] histograma;
    private int[] salario;
    
    public enum Rango {
        R200_299, R300_399, R400_499, R500_599, 
        R600_699, R700_799, R800_899, R900_999, R1000
    };
    //constante que no cambia de valor se escribe en mayúsculas
    public static final int NUMERO_DE_CASILLAS = 9;
    public SalarioPorComision(int[] ventas) {
        this.ventas = ventas;
        
        //Crear espacio a los datos
        this.salario = new int[ventas.length];
        this.histograma = new int[NUMERO_DE_CASILLAS];
    }
    
    public void calcularSalario(){
        for (int i = 0; i < ventas.length; i++){
            salario[i] = (int) (200 + 0.09*ventas[i]);
            switch(salario[i]){
                case 200:
                case 299: histograma[0]++; break;
            }
        }
    }
    
    public void imprimir(){
        
        System.out.println("Ventas: ");
        for (int i = 0; i < ventas.length; i++){
            System.out.print(ventas[i] + " ");
        }
        System.out.println("");
        
        System.out.println("Salario: ");
        for (int i = 0; i < salario.length; i++){
            System.out.print(salario[i] + " ");
        }
        System.out.println("");
    }
}