
package Fundamentos;

public class EDAlgoTP01 {
    
    public static void problemaE1(){
        System.out.println("Problema E1--------------");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++)
                System.out.print('@');
                
            System.out.println();   
        }
        System.out.println();
    }
    
    public static void problemaE2a(){
        System.out.println("Problema E2a--------------");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j <= i; j++)
                System.out.print('*');
                
            System.out.println();   
        }
        System.out.println();
    }
    public static void problemaE2b(){
        System.out.println("Problema E2b----------");
        for(int i = 0; i < 10; i++){
            for(int j = 1; j <= 10-i; j++)
                System.out.print('*');
                
            System.out.println(' ');   
        }
        System.out.println();
    }
    public static void problemaE2c(){
        System.out.println("Problema E2C----------");
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                if(j >= i)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println("");   
        }
        System.out.println();
    }
    public static void problemaE2d(){
        
        System.out.println("Problema E2D----------");
        for(int i = 1; i <= 10; i++){
            for(int k = 1; k <= 10 - i; k++){
                System.out.print(' ');
            }
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void problemaE3(){
        System.out.println("Problema E3----------");
        int[] nums = new int[] { 1, 2, 3, 4, 5 };
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    
    public static void problemaE4(){
        System.out.println("Problema E4----------");
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j > i; j--){
                System.out.print(' ');
            }
            for(int k = 1; k <= (2*i - 1); k++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--){
            for(int j = 5; j > i; j--){
                System.out.print(' ');
            }
            for(int k = 1; k <= (2*i - 1); k++){
                System.out.print('*');
            }
            System.out.println();
        }
        
    }
}

