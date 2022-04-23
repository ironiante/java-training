package Deitel_exercises.claseCuenta;

/**
 *
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
