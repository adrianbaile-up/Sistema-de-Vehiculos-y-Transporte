package transporte;

public class Coche extends Vehiculo implements ConMotor{

   
    /**
     * Constructor que recibe la velocidadMaxima (atributo heredado de Vehiculo)
     * @param velocidadMaxima
     */

    public Coche(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }
    

    


    /**
     * Método declarado en la clase Vehiculo y definido en la clase Coche
     * Muestra mensaje con la velocidadMaxima
     */

    @Override
    public void describir(){
        System.out.println("Soy un coche que puede alcanzar "+ getVelocidadMaxima()+" km/h");

    }



    

    /**
     * Método declarado en la interfaz ConMotor y definido en la clase Coche
     */

    @Override
    public void encenderMotor(){
        System.out.println("El motor del coche está encendido.");
    }


}
