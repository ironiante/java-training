package EjerciciosPOO;

import java.util.Scanner;

public class Operaciones {

    // atributos

    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    public void leernumeros() {
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese primer numero: "  );
        numero1 = Integer.parseInt(dato.nextLine());
        System.out.println("ingrese segundo numero:"  );
        numero2 = Integer.parseInt(dato.nextLine());
    }


    public void suma() {
        suma=numero1 + numero2;
    }

    public void salidaDatos() {
        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion  es: " + multiplicacion);
        System.out.println("la division es: " + division);
    }

    public void resta() {
        resta = numero1 - numero2;
    }

    public void multiplicacion() {
        multiplicacion = numero1 * numero2;
    }

    public void division() {
        division = numero1 / numero2;
    }
}
