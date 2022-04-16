package Ats;

public class Coche {
 // atributos del coche
 String color;
 String marca;
 int km;

 public static void main(String[] args) {
  // crear objeto de mi clase coche
  Coche coche1= new Coche();
  coche1.color="blanco";
  coche1.marca=" mazda";
  coche1.km= 0;
  System.out.println("el color del coche es: " +coche1.color);
  System.out.println("la marca del coche es: " + coche1.marca);
  System.out.println("el kilometraje del coche es: " +coche1.km);


 }
}
