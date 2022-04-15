package funcionesParametros;

public class FuncionesParametros {
/**
 * Creación de clase y método “main”
 * Creación de una función
 *  Estructura de una función
 *  Modificadores
 *  Invocación de una función
 *  Creación de funciones con parámetros
 *  Funciones con retorno
 *  Ventajas de las funciones
  */

public static void main(String[] args) {
// las funciones son agrupaciones de sentencias  pueden ser reutilizadas
// desde cualquier punto de nuestra aplicacion.
// se le llama metodos: cuando se trabaja con poo
//funcion cuando no se trabaja con opp
// void es lo que retorna ( no retorna nada)
// static = pertenece a la clase
// private es un modificador de visibilidad

    //holaMundo();
// por parametro
    //parametro cuando recibe
    // cuando se envia es argumento
    // holaMundo("victor  ");
    // holaMundo("jirman ");
     String hola =devolverhola();
    System.out.println(hola);

}

    private static String devolverhola() {
    return "esta funcion retorna un hola";
    }

    private static void holaMundo(String name) {
        System.out.println("hola me llamo "+name);

    }

  /*  private static void holaMundo() {
        System.out.println("hola vamos de nuevo");
        System.out.println("hola vamos de nuevo");
    }
*/




}
