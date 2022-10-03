/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;



/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 *
 * @author Luca Ahumada
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        int[][] matriz = new int[3][3];
        for( i = 0; i < matriz.length; i++) {
            for( j = i = 0; j < matriz.length; j++) {
               matriz[i][j] = (int) (Math.random()*((15- 1)+1)) + 1;
            }
        }
        System.out.println("----------MATRIZ NORMAL----------");
        for( i = 0; i < matriz.length; i++) {
            for( j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("----------MATRIZ TRASPUESTA----------");
        for( j = 0; i < matriz.length; i++) {
            for( i = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    
    }
}

