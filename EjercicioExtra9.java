/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String a;
        int residuo = 0, cociente = 0, num1, num2;
        boolean valor = true;
        do{
        System.out.println("Ingrese dos números a dividir: ");
        num1 = leer.nextInt(); num2 = leer.nextInt();
            System.out.println("La división es la siguiente: "+num1+" / "+num2);
            System.out.println("¿Desea continuar? (S/N) Si pone N se reinicia la solicitación de números");
           a = leer.next();
        }while(!"S".equals(a));
        System.out.println("Dividiendo "+num1+" / "+num2+" : ");
        while(valor){
            if(residuo == 0) {
                residuo = num1 - num2;
                num1 -= num2;
                cociente++;
            }else if(residuo > num2) {
                residuo = num1 - num2;
                num1 -= num2;
                cociente++;
            }
            if(residuo < num2){
                valor = false;
            }
        }
        System.out.println("La división a terminado");
        System.out.println("Residuo: "+residuo+" Y Cociente: "+cociente);
    }
    
}
