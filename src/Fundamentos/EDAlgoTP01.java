
package Fundamentos;

public class EDAlgoTP01 {
    
    public static void problemaE1(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++)
                System.out.print("@");
                
            System.out.println();   
        }
    }
    
    public static void problemaE2a(){
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j <= i; j++)
                System.out.print("@");
                
            System.out.println();   
        }
    }
    public static void problemaE2b(){
        System.out.println("Problema E2b");
        for(int i = 0; i < 10; i++){
            for(int j = 1; j <= 10-i; j++)
                System.out.print("@");
                
            System.out.println("");   
        }
    }
    public static void problemaE2c(){
        System.out.println("Problema E2C|||||||||||");
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                if(j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");   
        }
    }
    public static void problemaE2d(){
        
        System.out.println("Problema E2D|||||||||||");
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10-i+1; j++){
                if(j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");   
        }
    }
}

