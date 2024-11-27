package Tema2.EstructurasNoLineales.Recursividad;

/**
 *
 * @author karma
 */
public class RecursionLineal {

    public static void main(String[] args) {
        System.out.println("Suma Linear--------------------------");
//        int data1[] = {4, 3, 6, 2, 8};
//        int data2[] = {6, 5, 3, 1, 9};
//        int data3[] = {1, 7, 5, 9, 7};
//        System.out.println(linearSum(data1, 3));
//        System.out.println(linearSum(data1, 4));
//        System.out.println(linearSum(data1, 5));
//
//        System.out.println("Arreglo inverso--------------------------");
//        int data4[] = {4, 3, 6, 2, 8};
//        int data5[] = {6, 5, 3, 1, 9};
//        int data6[] = {1, 7, 5, 9, 7};
//        reverseArray(data4, 0, data4.length - 1);
//        for (int i : data4) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        reverseArray(data5, 0, data5.length - 1);
//        for (int i : data5) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        reverseArray(data6, 0, data6.length - 1);
//        for (int i : data6) {
//            System.out.print(i + " ");
//        }
        System.out.println("Potencias--------------------------------");
        System.out.println(powerBad(10, 10));
        System.out.println(powerGood(10,10));
        
        System.out.println("Suma binaria----------------------");
        int data7[] = {1, 7, 5, 9, 7};
        System.out.println(binarySum(data7, 2,4));
    }

    public static int linearSum(int[] data, int n) {
        if (n == 0) {
            return 0;
        } else {
            return linearSum(data, n - 1) + data[n - 1];
        }
    }

    public static void reverseArray(int[] data, int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }
    public static double powerBad(double x, int n){
        if(n == 0)
            return 1;
        else
            return x * powerBad(x, n-1);
    }
    public static double powerGood(double x, int n){
        if(n == 0)
            return 1;
        else{
            double partial = powerGood(x, n/2);
            double result = partial * partial;
            if (n % 2 ==1)
                result *= x;
            return result;
        }
    }
    public static int binarySum(int[] data, int low, int high){
        if(low > high)
            return 0;
        else if (low == high)
            return data[low];
        else{
            int mid = (low + high) / 2;
            return binarySum(data, low, mid) + binarySum(data, mid +1, high);
        }
    }
}
