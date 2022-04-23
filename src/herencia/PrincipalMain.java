package herencia;

public class PrincipalMain {
    public static void main(String[] args) {
        Coche objeto1 = new Coche();
        objeto1.color= "verde";
        objeto1.fabricante="mazda";
        objeto1.modelo="2022";
        objeto1.peso=12.8;
        objeto1.valocidad=0;
        objeto1.largo=3.0;
        objeto1.acelerar(50);


    cocheElectrico objeto2 = new cocheElectrico();
    objeto2.motorelectrico ="perkins";
    objeto2.color="blanco";
    objeto2.fabricante="tesla";
    objeto2.modelo="2022";



        cocheElectrico cocheElectrico2 = new cocheElectrico("amarillo","tesla","2021",12.5,8.2,"tesla"); // no se puede pasar todos los atributos del constructor principal
        System.out.println(cocheElectrico2);

 // sobre escritura , vamos a llamar el metodo acelerar de la clase base.
     objeto2.acelerar(50);



    }



    }

