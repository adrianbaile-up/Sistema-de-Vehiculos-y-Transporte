package transporte;

public final class Avion extends Vehiculo implements ConMotor {



    /**
     * Constructor que recibe la velocidadMaxima (atributo heredado de Vehiculo)
     * @param velocidadMaxima
     */

    public Avion(String velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }




    
    /**
     * Método declarado en la clase Vehiculo y definido en la clase Avion
     * Muestra mensaje con la velocidadMaxima
     */

    public void describir(){
        System.out.println("Soy un avión que vuela a "+ getVelocidadMaxima());
    };





     /**
     * Método declarado en la interfaz ConMotor y definido en la clase Avion
     */

    public void encenderMotor(){
        System.out.println("El motor del avión está encendido.");
    }

}
