package Deitel_exercises;

import java.util.Scanner;

public class Producto3Enteros {
    /***
     * calcular el producto de 3 enteros
     */
    public static void main(String[] args) { // crear metodo main
        Scanner entrada = new Scanner(System.in); // crear objeto
        int variable1; // creacion de variables
        int variable2;
        int variable3;
        int resultado;
        System.out.println(" ingrese primer valor");
        variable1 = entrada.nextInt();
        System.out.println(" ingrese segundo valor");
        variable2 = entrada.nextInt();
        System.out.println(" ingrese tercer valor");
        variable3 = entrada.nextInt();
        resultado = variable1 * variable2 * variable3 ;
        System.out.println(" el resultado es "+resultado);

    }
}
