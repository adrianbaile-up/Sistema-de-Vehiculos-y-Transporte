package transporte;

public class Barco extends Vehiculo implements ConMotor{



     /**
     * Constructor heredado de la clase base (Vehiculo)
     * @param velocidadMaxima
     */

    public Barco(int velocidadMaxima){
        super(velocidadMaxima);
    }




    /**
     * Método declarado en la clase Vehiculo y definido en la clase Barco
     * Muestra mensaje con la velocidadMaxima
     */

    @Override
    public void describir(){
        System.out.println("Soy un barco que navega a "+ getVelocidadMaxima()+ " km/h");
    };


    

    /**
     * Método declarado en la interfaz ConMotor y definido en la clase Barco
     */

    @Override
    public void encenderMotor(){
        System.out.println("El motor del barco está encendido.");
    }

}
