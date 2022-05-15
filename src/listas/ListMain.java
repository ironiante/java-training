package listas;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        // para poderlo implementar debemos saber que es una interface y para poderla
        // implementar y la implementacion de list es arraylist
        List<String> nombres = new ArrayList<>();

        // para agregar elementos.
        nombres.add("nombre 1");
        nombres.add("nombres 2");
        nombres.add("nombres 3");
        nombres.add("nombres 4");
        nombres.add("nombres 5");
        System.out.println(nombres);

        for (String nombre :nombres) {
            System.out.println(nombre);

        }
//______________________________________________________________________________________
// vamos a trabajar con la clase coche
    List<Coche>coches = new ArrayList<>(); // creamos el arraylist
    coches.add(new Coche("mazda"));
    coches.add(new Coche("allegro"));
    coches.add(new Coche("ford"));
        System.out.println(coches);

        for (Coche coche:coches){
            System.out.println(coche);
        }


    }
}
