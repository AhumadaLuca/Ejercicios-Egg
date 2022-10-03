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
public class Ejercicio6 {
//Crear un programa que dado un numero determine si es par o impar.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número a verificar si es PAR o IMPAR:");
        Scanner leer = new Scanner(System.in);
       int num = leer.nextInt();
        if( num % 2 == 0 ) {
            System.out.println("El número ingresado es PAR");
        }else{
            System.out.println("El número ingresado es IMPAR");
        }
    }
    
}
