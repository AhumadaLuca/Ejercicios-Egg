/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean verificar = false;
        System.out.println("Ingrese una letra y se detectará si es una vocal");
        String letra = leer.next();
        String[] vocales = {"A","E","I","O","U","a","e","i","o","u"};
        for(String vocal : vocales) {
            if(vocal.equals(letra)) {
                verificar = true;
                break;
            }
        }
        if(verificar) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
