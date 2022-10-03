/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
* El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 *
 * @author Luca Ahumada
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, opcion;
        boolean salir = false;
        Scanner leer = new Scanner(System.in);
        do{
        System.out.println("Ingrese dos números enteros positivos: ");
        System.out.print("Numero 1: ");
        num1 = leer.nextInt();
        System.out.print("Numero 2: ");
        num2 = leer.nextInt();
        }while (num1 <= 0 || num2 <= 0);
        System.out.println("Números ingresados: "+num1+" Y "+num2);
         while(!salir){
             System.out.println("MENÚ");
             System.out.println("1. Sumar");
             System.out.println("2. Restar");
             System.out.println("3. Multiplicar");
             System.out.println("4. Dividir");
             System.out.println("5. Salir");
             System.out.print("Elija opción: ");
             opcion = leer.nextInt();
             switch(opcion){
                 case 1: 
                     System.out.println("----------------------------------------");
                     System.out.println("La suma es: "+(num1 + num2));
                     System.out.println("----------------------------------------");
                 break;
                 case 2:
                     System.out.println("----------------------------------------");
                     System.out.println("La resta es: "+(num1 - num2));
                     System.out.println("----------------------------------------");
                 break;
                 case 3:
                     System.out.println("----------------------------------------");
                     System.out.println("La multiplicación es: "+(num1 * num2));
                     System.out.println("----------------------------------------");
                 break;
                 case 4:
                     System.out.println("----------------------------------------");
                     System.out.println("La división es: "+(num1 / num2));
                     System.out.println("----------------------------------------");
                 break;
                 case 5:
                     System.out.println("----------------------------------------");
                     System.out.println("¿Está seguro que desea salir? (S/N)");
                 String salida = leer.next();
                    System.out.println("----------------------------------------");
                 if(salida.equals("S")){
                     salir = true;
                     System.out.println("Saliendo del Programa...");
                 }
                 break;
             }
         }
    }
    
}
