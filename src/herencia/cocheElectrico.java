package herencia;

/**
 * herencia nos va a permitir utilizar codigo entre clases, se tendra una clase base o superclase
 * la cual nos proporciona un codigo, que con otras clases hijas o derivadas vamos a poder heredar
 *
 */
public class cocheElectrico extends Coche {

        String motorelectrico;
        public cocheElectrico(){        // creamos un contructor
                                         // utilizando el concepto de sobrecarga de funciones, podemos
                                         // temer multiples constructores



        }
    // crear varios constructores

    public cocheElectrico(String motorelectrico){
            this.motorelectrico = motorelectrico;

    }
    //vamos a sobrecargar un constructor para poder utilizar el super, le colocamos todos los atributos de la clase coche.
    public cocheElectrico( String color,String fabricante,String modelo,Double peso,Double lardo, String motorelectrico ){
    super(color,fabricante,modelo,peso,lardo );
    this.motorelectrico = motorelectrico;
    }
 // vamos a sobreescribir el codigo , colocando que se multiplique * 2 la velocidad.
    @Override
    public void acelerar(Integer cantidad) {
            Integer cantidadAjustada=cantidad*2;
        super.acelerar(cantidad);
    }

    @Override
    public String toString() {
        return "cocheElectrico{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", valocidad=" + valocidad +
                ", motorelectrico='" + motorelectrico + '\'' +
                '}';
    }
}
