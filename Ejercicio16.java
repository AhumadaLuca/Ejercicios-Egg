/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 *
 * @author Luca Ahumada
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0, veces = 0;
        do{
        System.out.print("Ingrese el tamaño del vector (no más de 20): ");
        num = leer.nextInt();
        }while (num > 50);
        int[] vector = new int[num];
        for(int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*20+0);
        }
        System.out.println("El vector se ha rellenado con valores aleatorios del 0 al 20");
        System.out.print("Ingrese el número a buscar: ");
        int buscar = leer.nextInt();
        for(int i = 0; i < vector.length; i++) {
            if(vector[i] == buscar) {
                System.out.print("-["+vector[i]+"]-");
            }else{
                System.out.print("["+vector[i]+"]");
            }
        }
        System.out.println("");
        for(int i = 0; i < vector.length; i++) {
            if(vector[i] == buscar && veces == 0) {
                System.out.print("El número a buscar apareció en la posición "+i);
                veces++;
            }else if (vector[i] == buscar && veces > 0){
                System.out.print(", "+i);
                veces++;
            }
        }
        System.out.println("");
        System.out.println("El número buscado ha aparecido "+veces+" vez/veces");
    }
    
}
