/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese números enteros (si es múltiplo de cinco se detendrá)");
        int par = 0, impar = 0, total = 0, num;
        Scanner leer = new Scanner(System.in);
        System.out.println("LOS NEGATIVOS NO SE SUMAN");
        do{
            System.out.print("Ingresa acá: ");
            num = leer.nextInt();
        if(num < 0) {
            break;
        }
        if(num % 2 == 0) {
            par++;
            total++;
        }else{
            impar++;
            total++;
        }
        
        }while(num % 5 != 0);
        System.out.println("Has ingresado un múltiplo de 5, se detuvo el bucle");
        System.out.println("Total de números leídos: "+total);
        System.out.println("números Pares: "+par);
        System.out.println("números Impares: "+impar);
    }
    
}
