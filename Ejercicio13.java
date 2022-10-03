/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 *
 * @author Luca Ahumada
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño;
        System.out.println("Ingrese un tamaño para su cuadrado de * : ");
        Scanner leer = new Scanner(System.in);
        tamaño = leer.nextInt();
        for(int i = 1; i <= tamaño; i++) {
            
            for(int j = 1; j <= tamaño; j++) {
                
                if(i == 1 || i == tamaño ) {
                    System.out.print("*");
                }else  if (j == 1 || j == tamaño) {
                    System.out.print("*");
                }else if( j > 1 || j < tamaño) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
