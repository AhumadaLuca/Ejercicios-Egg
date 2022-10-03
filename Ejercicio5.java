/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Luca Ahumada
 */
public class Ejercicio5 {
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero y se mostrará el Doble, el Triple y la Raíz Cuadrada:");
        Scanner leer = new Scanner(System.in);
        double num = leer.nextDouble();
        System.out.println("Doble del número: "+(num * 2));
        System.out.println("Triple del número: "+(num * 3));
        System.out.println("Raíz Cuadrada del número: "+(Math.sqrt(num)));
    }
    
}
