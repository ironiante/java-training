package listas;

public class Coche {
    String name = "nombre de coche "; // agregamos un atributo.
    public Coche(String name){  // creamos el constructor
        this.name=name;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }
}
