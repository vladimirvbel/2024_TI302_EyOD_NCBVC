/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema2.EstructurasNoLineales.Recursividad;

public class PowerBad {
    public static double powerBad(double x, int n) {
        if (n == 0)
            return 1;
        else
            return x * powerBad(x, n - 1);
    }
}
