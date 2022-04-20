package crearObjetos;

public class CrearObjetos {
    /**
     *  Qué son y cómo crear objetos.
     *  Nueva clase y método “main”
     *  Creación de objetos
     *  Distintos constructores: sobrecarga
     *  Invocación de métodos
     *  Cambiar valores
     *  Depuración del código
     */
    public static void main(String[] args) {
        Coche ob1 = new Coche();
        ob1.color="amarillo";
        ob1.fabricante="mazda";
        ob1.modelo="2022";
        ob1.peso=15.8;
        ob1.largo=3.0;
        ob1.valocidad= 0;
        ob1.acelerar(50);
        System.out.println(ob1);
    }
}
