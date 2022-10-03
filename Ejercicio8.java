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
public class Ejercicio8 {
/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese frases o palabras de 8 de largo");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("tamaño de frase: "+frase.length()+", CORRECTO");
        }else{
            System.out.println("tamaño de frase: "+frase.length()+", INCORRECTO");
        }
    }
}
