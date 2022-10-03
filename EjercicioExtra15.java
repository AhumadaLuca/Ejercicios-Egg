/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos números, después se solicitará que operación hacer");
        Scanner leer = new Scanner(System.in);
        double num1 = leer.nextDouble(); double num2 = leer.nextDouble();
       int valor;
        do{
            System.out.println("1. SUMA"
                                + "\n2. RESTA"
                                + "\n3. MULTIPLICAR"
                                + "\n4. DIVIDIR"
                                + "\n5. SALIR");
            valor = leer.nextInt();
            switch(valor){
                case 1: System.out.println("La suma de "+num1+" y "+num2+" es: "+(num1 + num2));
                break;
                case 2:System.out.println("La resta de "+num1+" y "+num2+" es: "+(num1 - num2));
                break;
                case 3:System.out.println("La multiplicación de "+num1+" y "+num2+" es: "+(num1 * num2));
                break;
                case 4:System.out.println("La división de "+num1+" y "+num2+" es: "+(num1 / num2));
                break;
                case 5:System.out.println("Saliendo del sistema");
            }
        }while(valor != 5);
    }
    
}
