package retornoFunciones;

import funcionesParametros.FuncionesParametros;

public class pruebaFunciones {
 // para llamar una funcion desde afuera se coloca el nombre de la clase
    // despues punto y nombre de la funcion.
 public static void main(String[] args) {
     RetornoFunciones.holaPepito();
     int suma = RetornoFunciones.sum( 8 ,6      );
     System.out.println(suma);
 }
}
