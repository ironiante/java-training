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
        System.out.println(objeto1);

    cocheElectrico objeto2 = new cocheElectrico();
    objeto2.motorelectrico ="perkins";
    objeto2.color="blanco";
    objeto2.fabricante="tesla";
    objeto2.modelo="2022";

        System.out.println(objeto2);


    }



    }

