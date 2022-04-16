package sobreCargaFunciones;

public class SobreCargaFunciones {
    /**
     * Qué es la sobrecarga de funciones y cómo funciona.
     * Sobrecarga de funciones
     * Sobrecarga con distintos tipos de datos
     * Comprobación
     *
     */
    public static void main(String[] args) {
 // hablamos que una funcione esta sobrecargada cuando se tiene el mismo nombre ejemplo

    holamundo("jirman","rodriguez ");
    holamundo();
    holamundo("jirman");

    }

    public static void holamundo() {
        System.out.println("hola mundo");

    }

    public static void holamundo(String name) {
        System.out.println("hola "+name);

    }

    public static void holamundo(String name,String surname) {
        System.out.println("hola"+name+""+surname);

    }
}
