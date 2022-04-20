package herencia;

public class Coche {
    // atributos

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer valocidad;
    // constructores
    public Coche() {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // metodo to string nos permite imprimir atraves de la consola lo que son los objetos creados
    // apartir de esta clase

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", valocidad=" + valocidad +
                '}';
    }
    // comportamiento
    public  void acelerar (Integer cantidad) {
        if (cantidad>0 && cantidad <= 120){
            this.valocidad += cantidad;
        }


    }




}
