/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema2.EstructurasNoLineales.Recursividad;

public class BinarySum {
    public static int binarySum(int[] data, int low, int high) {
        if (low > high)
            return 0;
        else if (low == high)
            return data[low];
        else {
            int mid = (low + high) / 2;
            return binarySum(data, low, mid) + binarySum(data, mid + 1, high);
        }
    }
}
