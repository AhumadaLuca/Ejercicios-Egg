/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 *
 * @author Luca Ahumada
 */
public class Ejercicio4 {
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una cantidad de grados ºC a convertir a ºF: ");
        Scanner leer = new Scanner(System.in);
        double grados = leer.nextDouble();
        System.out.println("Grados ºF: "+ (32 + (9 * grados / 5)) );
    }
    
}
