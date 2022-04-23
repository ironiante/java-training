package claseString;

import java.util.Locale;

public class StringMain {

    public static void main(String[] args) {
/**
 * la clase string.
 - length()
 - starswith("")
 - endswith("")
 - indexof("")
 - substring("")
 - trim()
 - equals()
 - compareTo

 */
        String mensaje = "hola mundo";
       //System.out.println(mensaje.length()); // cantidad de letras
        String mensajeMAY = mensaje.toUpperCase(Locale.ROOT);
        System.out.println(mensajeMAY);
      //   comparar dos lineas
        String otro = "HOLA MUNDO";
        if (mensajeMAY.equals(otro)) {
            System.out.println("verdadero");

        }
    }
}
