/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 *
 * @author Luca Ahumada
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la Clase de Socio (A, B ó C): ");
        Scanner leer = new Scanner(System.in);
        String tipo = leer.next();
        System.out.println("Ahora ingrese el costo del tratamiento: ");
        int monto = leer.nextInt();
        if("A".equals(tipo)) {
            System.out.println("Por ser Clase A su tratamiento tiene un 50% de descuento");
            System.out.println("El costo total es de: "+(monto - (monto * 0.5)));
        }else if("B".equals(tipo)) {
            System.out.println("Por ser Clase B su tratamiento tiene un 35% de descuento");
            System.out.println("El costo total es de: "+(monto - (monto * 0.35)));
        }else if("C".equals(tipo)) {
            System.out.println("Por ser Clase C su tratamiento no tiene descuento");
            System.out.println("El costo total es de: "+monto);
        }
    }
    
}
