/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 *
 * @author Luca Ahumada
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String salir = "";
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Euros a convertir: ");
        double cantidad = leer.nextDouble();
       do{
           System.out.println("Seleccione la moneda que quiera convertir sus Euros. ");
           System.out.println("1. Dólares $");
           System.out.println("2. Yenes ¥");
           System.out.println("3. Libras £");
           System.out.println("4. Salir");
           int salida = leer.nextInt();
           
           switch(salida) {
               case 1: convertir(cantidad, salida);
               break;
               case 2: convertir(cantidad, salida);
               break;
               case 3: convertir(cantidad, salida);
               break;
               case 4: 
                   System.out.println("----------------------------------------");
                   System.out.println("¿Está seguro de salir? (S/N)");
                salir = leer.next();
                System.out.println("----------------------------------------");
                if(salir == "S") {
                    System.out.println("Saliendo del programa...");
                }
           }
       }while (!"S".equals(salir));
        
        public static void convertir (double valor, int tipo) {
            DecimalFormat dosDecimales = new DecimalFormat("#.00");
                switch(tipo) {
               case 1:
                   System.out.println("----------------------------------------");
                   System.out.println(valor+" Euros => "+dosDecimales.format(valor * 1.28611) +" Dólares");
                   System.out.println("----------------------------------------");
               break;
               case 2:
                   System.out.println("----------------------------------------");
                   System.out.println(valor+" Euros => "+dosDecimales.format(valor * 129.852)+" Yenes");
                   System.out.println("----------------------------------------");
               break;
               case 3:
                   System.out.println("----------------------------------------");
                   System.out.println(valor+" Euros => "+dosDecimales.format(valor * 0.86)+" Libras");
                   System.out.println("----------------------------------------");
               
            }
        }
    }

    
    

