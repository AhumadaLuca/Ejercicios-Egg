/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de familias, después a cada una se le pedirá la cantidad de hijos y su edad");
        System.out.print("Ingrese N familias: ");
        Scanner leer = new Scanner(System.in);
        int media = 0, totalhijos = 0, cantidad = 0, hijos = 0;
        int familia = leer.nextInt();
        for(int i = 1; i <= familia; i++) {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print("Familia nº"+i+" ingrese la cantidad de hijos: "); cantidad = leer.nextInt();
            media += cantidad;
            for(int j = 1; j <= cantidad; j++) {
                System.out.print("Ingrese la edad del Hijo/a nº"+j+": "); hijos = leer.nextInt();
                totalhijos += hijos;
            }
        }
        System.out.println("La media de edad de los hijos de todas las familias es de: "+(totalhijos / media));
    }
    
}
