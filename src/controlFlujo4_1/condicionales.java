package controlFlujo4_1;

import java.util.Scanner;

public class condicionales {

    public static void main(String[] args) {
       // IF();
       // IFELSE();

    }

    public static void IF() {
        int edad = 18;
        boolean esMayor = edad >=18; // false
        if (esMayor){
            System.out.println(" es mayor de edad");
        }
        if (edad >=18){
            System.out.println("Es mayor de edad");
        }

    }

    public static void IFELSEIF() {
        int edad = 16;
        if (edad >= 18){ // si es true entra aqui
            System.out.println(" es mayor de edad");
        } else { // si es false ingresa aqui
            System.out.println(" Es menor de edad");
        }

    }
    public static void diasSemana(){
/**
 * ejemplos comparar --> cuando es numero se usa ==
 * cuando se quiere comparar String se usa .equals
 */
 String dia = "DiaNostro";
// ejemplos comparar
        boolean resultadadoCompararNum = 5==5;
        boolean resultado = dia.equals("martes");
        
    }
}