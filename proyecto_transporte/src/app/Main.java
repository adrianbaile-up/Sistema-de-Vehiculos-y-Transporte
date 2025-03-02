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



    Coche coche= new Coche("180 km/h");

    coche.arrancar();
    coche.encenderMotor();
    coche.describir();

    System.out.println("\n");



    Bicicleta bicicleta=new Bicicleta("30 km/h");

    bicicleta.arrancar();
    bicicleta.usarFuerzaHumana();
    bicicleta.describir();

    System.out.println("\n");



    Barco barco=new Barco("50 km/h");

    barco.arrancar();
    barco.encenderMotor();
    barco.describir();

    System.out.println("\n");


    Avion avion=new Avion("900 km/h");

    avion.arrancar();
    avion.encenderMotor();
    avion.describir();

}
    
}
