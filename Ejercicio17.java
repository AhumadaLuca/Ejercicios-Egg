/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * @author Luca Ahumada
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        do{
        System.out.print("Ingrese el tamaño del vector (no más de 10): ");
        num = leer.nextInt();
        }while (num > 10);
        int[] vector = new int[num];
        System.out.println("Quiere ingresar manualmente los números? (S-s/N-n) ");
        System.out.println("Si ingresa `N-n` se rellenarán automaticamente (números de hasta 5 dígitos) ");
        String opcion = leer.next();
        
        if ("S".equals(opcion) || "s".equals(opcion)) {
            for( int i = 0; i < vector.length; i++) {
                do{
                System.out.print("Posición "+i+": ");
                vector[i] = leer.nextInt();
                }while (vector[i] > 99999 || vector[i] < 0);
            }
        }else if( "N".equals(opcion) || "n".equals(opcion)) {
            for(int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*((99999- 9)+1)) + 9;
            }
        }else{
            System.out.println("Usted ingreso un valor no solicitad, reinicie el sistema");
        }
        System.out.println("--------------MOSTRANDO VECTOR--------------");
        for(int i = 0; i < vector.length; i++) {
                System.out.print(" ["+vector[i]+"] ");
        }
        System.out.println("");
        System.out.println("--------------MOSTRANDO RESULTADO--------------");
        for(int i = 0; i < vector.length; i++) {
            System.out.println("El número en la Posición "+i+" tiene "+Math.floor(Math.log10(Math.abs(vector[i]))+1)+" Dígitos");
        }
    }
    
}
