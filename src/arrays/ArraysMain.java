package arrays;

public class ArraysMain {
    public static void main(String[] args) {
        String numero1 = "nombre 1";
        String numero2 = "nombre 2";
        String numero3 = "nombre 3";

        String[] nombres = new String[3]; // se crea una estrutura de datos, arrays estaticos, pero esta vacia.
        nombres[0] = numero1;               // rellenar el array
        nombres[1] = numero2;
        nombres[2] = numero3;
        // otra forma de declarar los arrays.
        String[] nombres2 = new String[]{numero1, numero2, numero3};

        for (int i = 0; i < nombres.length; i++) {  // hacemos un bucle for que recorra esa estrutura de datos, length es el tamaño del array
            System.out.println(nombres[i]);
        }

        for (int i = 0; i < nombres2.length; i++) {
            System.out.println(nombres2[i]);

        }
    }

}
