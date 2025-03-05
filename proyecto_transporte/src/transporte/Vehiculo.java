package transporte;

public abstract class Vehiculo {

    /**
     * Atributos
     */

    protected int velocidadMaxima;


    /**
     * Constructor que se extenderá a las subclases que la hereden
     * @param velocidadMaxima
     */

    public Vehiculo(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }


    /**
     * Método para arrancar el vehiculo mostrando un mensaje
     */

    public void arrancar(){
        System.out.println("El vehículo está en marcha.");
    }


    /**
     * Método abstracto unicamente declarado para describir el vehiculo
     */

    public abstract void describir();



    /**
     * Método getter para obtener velocidadMaxima
     * @return velocidadMaxima
     */

    public int getVelocidadMaxima(){

        return this.velocidadMaxima;
    };



    /**
     * Método setter para establecer velocidadMaxima
     */

    public void setVelocidadMaxima(int velocidadMaxima){

        this.velocidadMaxima=velocidadMaxima;
    }

}
