/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int adivinar = (int) (Math.random()*10+0) * (int) (Math.random()*10+0);
        int num;
        System.out.println("Adivine el resultado de la multiplicación de dos números aleatorios entre 0 y 10 "+adivinar);
        num = leer.nextInt();
        do{
            if(num != adivinar) {
                System.out.println("Respuesta incorrecta, ingrese nuevamente");
                num = leer.nextInt();
            }
            if(num == adivinar) {
                System.out.println("Respuesta correcta");
            }
        }while(num != adivinar);
        
    }
    
}
