package retornoFunciones;

/**
 * El ámbito y retorno de las funciones.
 * Modificadores de visibilidad: private , accesible desde la clase que se programo
 * Modificadores de visibilidad: public
 * Modificadores de visibilidad: protected;solo las clases hijas o que esten en
 * el mismo paquete van a poder acceder a esa funcion.
 * Modificadores de retorno
 * Modificador “void”
 */
public class RetornoFunciones {
    public static void main(String[] args) {
        holaPepito();
    }

    public static void holaPepito() {
        System.out.println("prueba de llamado de funciones ");
    }

    public static int sum(int number1,int number2 ) {
        return number1 + number2 ;
    }

    {

    }
}
