package JavaAFondo.IngresarDatos;

import java.util.Scanner;

public class DatosUsuario {
/*
*El siguiente programa pide al usuario que ingrese su nombre, edad y altura. Estos datos
deben ingresarse separados por un espacio en blanco. Luego los muestra por consola.

*  */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
// Mensaje para el usuario
    System.out.print("Ingrese nombre edad altura: ");
// leemos el nombre
    String nom = scanner.next();
// leemos la edad
    int edad= scanner.nextInt();
// leemos la altura
    double altura = scanner.nextDouble();
// mostramos los datos por consola
    System.out.println("Nombre: "+nom   +" Edad: "+edad  +" Altura : "+altura);
}

}
