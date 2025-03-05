package app;

import transporte.Avion;
import transporte.Barco;
import transporte.Bicicleta;
import transporte.Coche;


/**
 * Uso de clase Main para realización de pruebas con objetos del paquete transporte
 */

public class Main {
public static void main(String[] args) {


    //Creación objeto clase Coche
    Coche coche= new Coche(180);

    coche.arrancar();
    coche.encenderMotor();
    coche.describir();

    System.out.println("\n");



    //Creación objeto clase Bicicleta
    Bicicleta bicicleta=new Bicicleta(30);

    bicicleta.arrancar();
    bicicleta.usarFuerzaHumana();
    bicicleta.describir();

    System.out.println("\n");



    //Creación objeto clase Barco
    Barco barco=new Barco(50);

    barco.arrancar();
    barco.encenderMotor();
    barco.describir();

    System.out.println("\n");

    

    //Creación objeto clase Avion
    Avion avion=new Avion(900);

    avion.arrancar();
    avion.encenderMotor();
    avion.describir();

}
    
}
