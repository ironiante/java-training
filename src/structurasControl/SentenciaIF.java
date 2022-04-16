package structurasControl;

public class SentenciaIF {
    public static void main(String[] args) {
// podemos trabajar con boleanos o enteros
        boolean check = 5 < 10;
        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        if (number1 < number2 && number2 < number3) { // se tiene que cumplir las dos condiciones.
            System.out.println("esto es verdadero");
        } else {
            System.out.println("falso");
        }
        System.out.println("fin");

    }
}
