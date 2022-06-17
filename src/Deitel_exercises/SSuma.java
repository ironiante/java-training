package Deitel_exercises;

import java.util.Scanner;

public class SSuma {
    /**
     * programa que recibe dos numeros y  muestra la suma.
     * 1. crear metodo main (empieza la ejecucion de la aplicacion).
     * 2. crear objeto scanner (para obtener la entrada  de la ventana de comandos)
     * 3. creamos 3 variables. numeros a sumar y resultado.
     * 4. escriba el primer numero ---> indicador.
     * 5. lee el primer numero y lo guarda en la variable
     * 6. escriba el segundo numero ----> indicador
     * 7. lee el segundo numero y lo guarda en la variable
     * 8. suma los numeros y despues los alamacena en el total suma.
     * 9. muestra la suma -->
     * probamos con 45 y 72 = 117
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;
        System.out.println("escriba el primer entero");
        numero1 = entrada.nextInt();
        System.out.println("escriba el segundo numero");
        numero2 = entrada.nextInt();
        suma = numero1 + numero2 ;
        System.out.println("la suma es " + suma);
    }
}
