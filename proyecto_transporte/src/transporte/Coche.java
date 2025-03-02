package transporte;

public class Coche extends Vehiculo implements ConMotor{

   
    /**
     * Constructor que recibe la velocidadMaxima (atributo heredado de Vehiculo)
     * @param velocidadMaxima
     */

    public Coche(String velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }
    


    /**
     * Método getter creado en la clase Vehiculo y extendido en la clase Coche
     * @return velocidadMaxima
     */

    @Override
    public String getVelocidadMaxima() {
        return super.getVelocidadMaxima();
    }


    
    /**
     * Método declarado en la clase Vehiculo y definido en la clase Coche
     * Muestra mensaje con la velocidadMaxima
     */

    public void describir(){
        System.out.println("Soy un coche que puede alcanzar "+ getVelocidadMaxima());

    }


    /**
     * Método declarado en la interfaz ConMotor y definido en la clase Coche
     */

    public void encenderMotor(){
        System.out.println("El motor del coche está encendido.");
    }


}
