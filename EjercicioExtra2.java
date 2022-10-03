/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,C,D, aux = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor diferente a cada variable, después se cambiaran sus valores.");
        System.out.print("Valor A: ");A = leer.nextInt(); 
        System.out.print("Valor B: ");B = leer.nextInt(); 
        System.out.print("Valor C: ");C = leer.nextInt(); 
        System.out.print("Valor D: ");D = leer.nextInt();
        aux = D;
        D = B;
        B = aux;
        aux = A;
        A = B;
        B = C;
        C = aux;
        System.out.println("CAMBIO DE VALORES");
        System.out.println("Valor A: "+A);
        System.out.println("Valor B: "+B);
        System.out.println("Valor C: "+C); 
        System.out.println("Valor D: "+D);
    }
    
}
