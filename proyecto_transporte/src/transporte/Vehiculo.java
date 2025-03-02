package transporte;

public abstract class Vehiculo {

    /**
     * Atributos
     */

    protected String velocidadMaxima;


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

    public String getVelocidadMaxima(){

        return this.velocidadMaxima;
    };



    /**
     * Método setter para establecer velocidadMaxima
     */

    public void setVelocidadMaxima(String velocidadMaxima){

        this.velocidadMaxima=velocidadMaxima;
    }

}
