package Deitel_exercises.claseCuenta;

/**
 * clase cuenta que contiene una variable de instancia llamada nombre; los objetos tienen atributos
 * y metodos para establecer y obtener su valor.
 */
public class cuenta {
    private  String nombre; // variable de instancia

    public  void establecerNombre(String nombre ) {  //metodo para establecer el nombre del objeto
        this.nombre = nombre; // almacenar el nombre
    }
    // metodo para obtener el nombre del objeto
    public String obtenerNombre(){
        return nombre; // devuelve el valor de nombre a quien lo invoco
    }

}
