/* ITESS-TICS
   Agosto-Diciembre 2024
   EyOD
   Prof: Montecillo
   Programador: Nam_chul Bruno Vázquez Coronado
   Descripción: Arreglos
   Fecha: 03/09/2024
*/
package minicurso.JF;

public class Arreglos {
    private int arr[] = new int[10];

    public void unosVer1(){
        for (int i = 0; i < arr.length; i = i+2) {
            arr[i]= 1;
            i++;
        }
        for (int i = 0; i < arr.length; i++)
            if (i % 2 == 0){
                arr[i]= 1;
            }else{
                arr[i] = 0;
            }
    }
    public void unosVer2(){
        for (int i = 0; i < arr.length; i = i+2) {
            arr[i]= 1;
            i++;
        }
        for (int i = 0; i < arr.length; i++)
            if (i % 2 == 0){
                arr[i]= 0;
            }else{
                arr[i] = 1;
            }
    }
    public void fill0to9(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
    public void clean(){
        for(int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }
    }
    public void from9to0(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - 1 -i;
        }
    }
    
    public void shiftRight(){
        int aux1 = arr[0];
        int aux2 = arr[0];
        
        for(int i = 0; i < arr.length - 1; i++){
            aux2 = arr[i+1];
            arr[i+1] = aux1;
            aux1 = aux2;
        }
        arr[0]= aux1;
    }
    
    public void shifttLeft(){
        int aux1 = arr[0];
        int aux2 = arr[0];
        
        for(int i = 0; i < arr.length - 1; i++){
            aux2 = arr[i+1];
            arr[i+1] = aux1;
            aux1 = aux2;
        }
        arr[0]= aux1;
    }
    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < arr.length; i++){
            str += arr[i] + " ";
        }
        return str;   
    }
    
}
