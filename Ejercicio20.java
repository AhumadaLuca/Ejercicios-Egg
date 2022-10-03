/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 *
 * @author Luca Ahumada
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int verificacion= 0, suma = 0, validar = 0;
        int[][] matriz = new int[3][3];
        System.out.println("Ingrese números del 1 al 9");
        for( int i = 0; i < matriz.length; i++) {
            for( int j = 0; j < matriz.length; j++) {
                do{
                System.out.print("Posición ["+i+"]["+j+"]:");
                matriz[i][j] = leer.nextInt();
                }while (matriz[i][j] > 9 || matriz[i][j] < 1);
                
            }
        }
        //VERIFICAR FILAS
        for(int i = 0; i < matriz.length; i++) {
            suma = 0;
            for(int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
            if( verificacion == 0) {
                validar = suma;
                verificacion++;
            }else if(verificacion >= 1) {
                if(validar == suma) {
                    verificacion++;
                }
            }
        }
        //VERIFICAR COLUMNAS
        for(int j = 0; j < matriz.length; j++) {
            suma = 0;
            for(int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            if(verificacion >= 1) {
                if(validar == suma) {
                    verificacion++;
                }
            }
        }
        //VERIFICAR DIAGONAL PRINCIPAL
        suma = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(i == j){
                   suma += matriz[i][j]; 
                }
            }
        }
         if(verificacion >= 1) {
                if(validar == suma) {
                    verificacion++;
                }
            }
        //VERIFICAR DIAGONAL SECUNDARIA
        suma = 0;
         for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(i+j-1 == j){
                   suma += matriz[i][j]; 
                }
            }
        }
         if(verificacion >= 1) {
                if(validar == suma) {
                    verificacion++;
                }
            }
        if(verificacion == 8) {
            System.out.println("SU MATRIZ ES MAGICA");
        }else{
            System.out.println("SU MATRIZ NO ES MAGICA");
        }
    }
}
