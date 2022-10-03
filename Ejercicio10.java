/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 *
 * @author Luca Ahumada
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, num, res;
        do{
            System.out.println("Ingrese un valor límite positivo: ");
            limite = leer.nextInt();
        }while (limite <= 0);
        res = 0;
        while(res <= limite) {
            if(res == 0) {
                System.out.println("Ingrese números a sumar, se detendrá cuando superen el límite:");
            }else{
                System.out.println("Ingrese otro número:");
            }
            num = leer.nextInt();
            res += num;
        }
        System.out.println("Ha superado el límite indicado: "+limite);
        System.out.println("La suma de los números dieron: "+res);
    }
    
}
