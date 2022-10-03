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
public class Ejercicio1 {
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese dos números enteros para sumar: ");
        System.out.print("Num1: ");
        num1 = leer.nextInt();
         System.out.print("Num2: ");
         num2 = leer.nextInt();
         System.out.println("La suma de los enteros es de: "+ (num1+num2));
    }
    
}
