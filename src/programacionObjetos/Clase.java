package programacionObjetos;
// alt + insertar = generar constructores
public class Clase {
    // atributos
    String color;
    String fabricante;
    String Moldelo;
    Double peso;
    Double largo;
    Integer velocidad=0;
    // constructores , comienzan en mayuscula y tiene el mismo nombre de la clase
    public Clase(String color,String fabricante,String Moldelo,Double peso,
                 Double largo){
     this.color = color;
     this.fabricante = fabricante;
     this.Moldelo = Moldelo;
     this.peso = peso;
     this.largo = largo;

    }
    // comportamiento
    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad <=120){
            this.velocidad += cantidad;
        }


    }

}
