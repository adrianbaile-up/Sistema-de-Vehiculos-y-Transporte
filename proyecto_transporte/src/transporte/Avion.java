package transporte;

public final class Avion extends Vehiculo implements ConMotor {



    /**
     * Constructor heredado de la clase base (Vehiculo)
     * @param velocidadMaxima
     */

    public Avion(int velocidadMaxima){
        super(velocidadMaxima);
    }




    
    /**
     * Método declarado en la clase Vehiculo y definido en la clase Avion
     * Muestra mensaje con la velocidadMaxima
     */

    @Override
    public void describir(){
        System.out.println("Soy un avión que vuela a "+ getVelocidadMaxima()+" km/h");
    };




     /**
     * Método declarado en la interfaz ConMotor y definido en la clase Avion
     */

    @Override
    public void encenderMotor(){
        System.out.println("El motor del avión está encendido.");
    }

}
