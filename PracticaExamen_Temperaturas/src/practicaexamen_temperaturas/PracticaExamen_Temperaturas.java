/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexamen_temperaturas;

import java.util.Scanner;

/**
 *
 * @author DAM118
 */
public class PracticaExamen_Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una temperatura: ");
        double temp = teclado.nextDouble();
        double kelvin = temp + 273.15;
        System.out.printf("%,.2fºC equivale a %,.2fK\n", temp, kelvin);

    }

}
