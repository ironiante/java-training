package bucles;

/**
 * La importancia del continue y break.
 *  Estructuras de control
 * Estructura “if” / “continue
 *  Uso de “break”
 *  Uso dentro de bucle “for”
 *
 */
public class ContinueAndBreak {
    public static void main(String[] args) {
/*palabras reservadas,permiten alterrar el flujo de las estrucutras de control bucles for
y bucles while, continuo salta la condicion.
*/
 int count =0;
 while (count<10){
     count++;//condicion
     if (count ==6)
         break; // rompe el flujo
         //continue; // salta el valor 6 y continua a la siguiente iteracion
     System.out.println("prueba  " + count);

 }
    }


}
