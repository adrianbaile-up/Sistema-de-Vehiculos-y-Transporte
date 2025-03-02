package transporte;

public class Bicicleta extends Vehiculo implements SinMotor{


    /**
     * Constructor que recibe la velocidadMaxima (atributo heredado de Vehiculo)
     * @param velocidadMaxima
     */

    public Bicicleta(String velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }



    
    /**
     * Metodo declarado en la clase de la que herada (Vehiculo) y definida en esta (Bicicleta)
     * Muestra mensaje con la velocidadMaxima
     */

    public void describir(){
        System.out.println("Soy una bicicleta con una velocidad máxima de " + getVelocidadMaxima());

    }



    

    /**
     * Metodo declarado en la interfaz SinMotor y definido en esta clase
     */

    public void usarFuerzaHumana(){
        System.out.println("Usando fuerza humana para mover la bicicleta.");
    }
}
