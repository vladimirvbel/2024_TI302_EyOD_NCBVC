package Tema2.EstructurasNoLineales.Recursividad;

/**
 *
 * @author karma
 */
public class RecursionNoLineal {

    public static void main(String[] args) {
        System.out.println("Suma Linear--------------------------");
        int data1[] = {4, 3, 6, 2, 8};
        int data2[] = {6, 5, 3, 1, 9};
        int data3[] = {1, 7, 5, 9, 7};
        System.out.println(LinearSum.linearSum(data1, 3));
        System.out.println(LinearSum.linearSum(data1, 4));
        System.out.println(LinearSum.linearSum(data1, 5));

        System.out.println("Arreglo inverso--------------------------");
        int data4[] = {4, 3, 6, 2, 8};
        int data5[] = {6, 5, 3, 1, 9};
        int data6[] = {1, 7, 5, 9, 7};
        ReverseArray.reverseArray(data4, 0, data4.length - 1);
        for (int i : data4) {
            System.out.print(i + " ");
        }
        System.out.println();
        ReverseArray.reverseArray(data5, 0, data5.length - 1);
        for (int i : data5) {
            System.out.print(i + " ");
        }
        System.out.println();
        ReverseArray.reverseArray(data6, 0, data6.length - 1);
        for (int i : data6) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Potencias--------------------------------");
        System.out.println("PowersGood");
        System.out.println(PowerBad.powerBad(10, 10));
        System.out.println(PowerBad.powerBad(10, 50));
        System.out.println(PowerBad.powerBad(10, 100));
        System.out.println(PowerBad.powerBad(10, 1000));
        System.out.println(PowerBad.powerBad(10, 10000));
        System.out.println("PowersBad");
        System.out.println(PowerGood.powerGood(10,10));
        System.out.println(PowerGood.powerGood(10,50));
        System.out.println(PowerGood.powerGood(10,100));
        System.out.println(PowerGood.powerGood(10,1000));
        System.out.println(PowerGood.powerGood(10,10000));
        
        System.out.println("Suma binaria----------------------");
        int data7[] = {4, 3, 6, 2, 8};
        int data8[] = {6, 5, 3, 1, 9};
        int data9[] = {1, 7, 5, 9, 7};
        System.out.println(BinarySum.binarySum(data7, 1,4));
        System.out.println(BinarySum.binarySum(data8, 0,4));
        System.out.println(BinarySum.binarySum(data9, 3,4));
    }
}