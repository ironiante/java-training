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
