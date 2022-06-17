package Deitel_exercises.claseCuenta;

import java.util.Scanner;

public class CComparacion {
    /***
     * comparar enteros utlizando instrucciones if, operadores relacionales y de igualdad
     * 1. crear metodo main
     * 2. crear el objeto scanner para la entrada de la ventana de comandos.
     * 3. crear dos variables
     * 4. escriba el primer entero ---> indicador
     * 5. lee el primer numero del usuario y lo guarda
     * 6. escriba el segundo numero entero ---> indicador
     * 7. lee el segundo numero del usuario y lo guarda
     * 8. codicional 1 ---> son iguales
     * 9. codicional 2 ---> diferente
     * 10. codicional 3 ---> menor
     * 11. codicional 4 ---> mayor
     * 12. codicional 5 ---> menor e igual
     * 13. codicional 6 ---> mayor e igual
     * probar con; 777  y 777
     * probar con ; 1000 y 2000
     * probar con 2000 y 1000
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        System.out.println("ingrese primer entero");
        a = entrada.nextInt();
        System.out.println("ingrese segundo entero");
        b = entrada.nextInt();
        if (a == b){
            System.out.println("son iguales" );
        }
        if (a != b){
            System.out.println("son diferentes");
        }
        if (a < b){
            System.out.println(" es menor ");
        }
        if (a>b){
            System.out.println(" es mayor");
        }

    }
}
