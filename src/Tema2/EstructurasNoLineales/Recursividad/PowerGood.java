/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema2.EstructurasNoLineales.Recursividad;

public class PowerGood {
    public static double powerGood(double x, int n) {
        if (n == 0)
            return 1;
        else {
            double partial = powerGood(x, n / 2);
            double result = partial * partial;
            if (n % 2 == 1)
                result *= x;
            return result;
        }
    }
}
