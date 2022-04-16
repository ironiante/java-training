package bucles;

/**
 * SwitchCase
 * Qué son las sentencias switch y para qué sirven.
 * Nueva clase y método “main”
 * Sintaxis de de sentencias “switch”
 *  Caso por defecto
 *  Comprobaciones
 *  Cuándo usar sentencias “switch”
 */
public class SentenciasSwitch {
    public static void main(String[] args) {
 // equivalente a la if else, se tiene multiples if
 String weather = "asdsddf";
 switch (weather){
     case "sunny":
         System.out.println("el tiempo es soleado");
         break;
     case "cloudy":
         System.out.println("el tiempo es nublado");
         break;
     default:
         System.out.println("no se a podido identificar el clima");
         break;
 }


    }
}
