/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int bajos = 0, altos = 0;
        double b = 0, a = 0;
        System.out.println("Ingrese la cantidad de personas a censar su estatura: ");
        int num = leer.nextInt();
        double[] vector = new double[num];
        System.out.println("Ahora ingrese la estatura de cada persona: ");
        for(int i = 0; i < vector.length; i++) {
            System.out.print("Persona nº"+i+": ");
            vector[i] = leer.nextDouble();
        }
        for(int i = 0; i < vector.length; i++) {
            if(vector[i] < 1.60) {
                b += vector[i];
                bajos++;
            }else if(vector[i] >= 1.60) {
                a += vector[i];
                altos++;
            }
        }
        System.out.println("Promedio de estaturas debajo de 1.60mts: "+(b / bajos));
        System.out.println("Promedio de estaturas generales: "+((a + b) / (altos + bajos)));
    }
    
}
