/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciónajava;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
* Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 *
 * @author Luca Ahumada
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int aceptado = 0, negado = 0;
      String cadena;
      boolean salir = false;
      Scanner leer = new Scanner(System.in);
        System.out.println("Simulación de Dispositivo RS232");
        System.out.println("Ingrese cadenas (Puede finalizar ingresando &&&&&)");
       do{ 
        System.out.print("Ingrese: ");
        cadena = leer.next();
        if( cadena.substring(0, 1).equals("X") && cadena.substring(cadena.length()-1, cadena.length()).equals("O")) {
            if(cadena.length() <= 5){
                aceptado++;
            }else if(!"&&&&&".equals(cadena)){
                negado++;
            }
        }else if (!"&&&&&".equals(cadena)){
            negado++;
        }
        if("&&&&&".equals(cadena)) {
            salir = true;
        }
       }while (!salir);
       System.out.println("----------------------------------------");
        System.out.println("IMPRIMIENDO INFORME...");
        System.out.println("Lecturas correctas: "+aceptado);
        System.out.println("Lecturas incorrectas :"+negado);
        System.out.println("----------------------------------------");
   }
    
}
