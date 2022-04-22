package Deitel_exercises;

import java.util.Scanner;

/**
 * Compara enteros utilizando instrucciones if, operadores relacionales
 *  y de igualdad.
 */
public class Comparacion {
 // metodo main empieza la ejecucion de la aplicacion de java
 public static void main(String[] args) {
     // metodo scanner para obtener la entrada de la ventana de comandos
     Scanner entrada = new Scanner(System.in);
     // declaramos las variables , que son los dos numeros a comparar
     int numero1;
     int numero2;
     //indicador
     System.out.println(" ingrese primer numero");
     numero1 = entrada.nextInt(); // lee el primer numero del usuario.
     System.out.println(" ingrese el segundo numero");
     numero2 = entrada.nextInt();
     if (numero1 == numero2) ;
     System.out.println();


 }
}
