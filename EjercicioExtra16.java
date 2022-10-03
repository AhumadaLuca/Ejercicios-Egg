/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de N personas.");
        Scanner leer = new Scanner(System.in);
        int edad;
        int cantidad = leer.nextInt();
        String nombre, valor = "";
        do{
            for(int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese su nombre: "); nombre = leer.next(); System.out.print("Y ahora su edad: "); edad = leer.nextInt();
                if(edad >= 18) {
                    System.out.println("Es Mayor de Edad");
                }else{
                    System.out.println("Es Menor de Edad");
                }
                System.out.println("");
                System.out.println("Quiere seguir mostrando personas? (S/N)");
                valor = leer.next();
                if("N".equals(valor)){
                    break;
                }
            }
        }while(!"N".equals(valor));
        
    }
    
}
