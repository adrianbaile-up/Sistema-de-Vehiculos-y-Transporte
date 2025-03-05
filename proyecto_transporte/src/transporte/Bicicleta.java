package transporte;

public class Bicicleta extends Vehiculo implements SinMotor{


    /**
     * Constructor heredado de la clase base (Vehiculo)
     * @param velocidadMaxima
     */

    public Bicicleta(int velocidadMaxima){
        super(velocidadMaxima);
    }



    
    /**
     * Metodo declarado en la clase de la que herada (Vehiculo) y definida en esta (Bicicleta)
     * Muestra mensaje con la velocidadMaxima
     */

    @Override
    public void describir(){
        System.out.println("Soy una bicicleta con una velocidad máxima de " + getVelocidadMaxima() + " km/h");

    }



    

    /**
     * Metodo declarado en la interfaz SinMotor y definido en esta clase
     */

    @Override
    public void usarFuerzaHumana(){
        System.out.println("Usando fuerza humana para mover la bicicleta.");
    }
}
