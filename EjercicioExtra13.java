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
public class EjercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su escalera: ");
        int tamaño = leer.nextInt();
        for(int i = 1; i <= tamaño; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
