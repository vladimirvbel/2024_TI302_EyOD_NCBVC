
package Fundamentos;

public class EDAlgoTP02Test {
    public static void main (String ...args){
        
    }
    
    public static void salarioPorCobrarTest(){
        int [] ventas = {5000, 230, 430, 590};
        System.out.println("E3: SalarioPorComisionTest");
        SalarioPorComision spc = new SalarioPorComision(ventas);
        spc.calcularSalario();
        spc.imprimir();
    }
}
