package Deitel_exercises;

import java.util.Scanner;

/**
 * Programa que recibe dos números y muestra la suma.
 */
public class suma {
    public static void main(String[] args) {
// creamos el metodo escanner para obtener la entrada de comandos
        Scanner entrada = new Scanner(System.in);
//declarar variables
int numero1;
int numero2;
int suma;
//lea el primer numero del usuario
        System.out.println("escriba el primer entero");
        numero1 = entrada.nextInt();
// escriba el segundo numero
        System.out.println(" escriba el segundo numero");
        numero2=entrada.nextInt();
// accion

suma=numero1+numero2; // suma los numeros , despues almacena el total en suma.
        System.out.println("la suma es " + suma);

    }
}
