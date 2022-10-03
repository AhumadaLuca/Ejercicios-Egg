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
public class Ejercicio3 {
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase, a continuación se mostrará toda en mayús y minus:");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        System.out.println("Frase en Mayúsculas: ");
        System.out.println(frase.toUpperCase());
        System.out.println("Frase en Minúsculas: ");
        System.out.println(frase.toLowerCase());
    }
    
}
