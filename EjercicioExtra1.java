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
public class EjercicioExtra1 {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dias = 0, horas = 0, num;
        System.out.println("Ingrese un tiempo en minutos, después se devolverá su equivalente en días y horas. ");
        num = leer.nextInt();
       do{
        if(num >= 1440) {
            num = num - 1440;
            dias++;
        }else if(num < 1440) {
            if(num >= 60) {
                num = num - 60;
                horas++;
                }
            }else if(num < 60) {
                num = 0;
            }
        }while (num > 0);
       System.out.println("El equivalente de sus minutos es: "+dias+" Día/s y "+horas+" Hora/s");
    }
}
