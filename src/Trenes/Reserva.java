package Trenes;

public class Reserva {
    private String codigo;
    private Integer cantDePersonas;
    private Estacion estacionDeOrigen;
    private Estacion estacionDeDestino;


    public Reserva(String codigo, Integer cantDePersonas, Estacion estacionDeOrigen, Estacion estacionDeDestino) {
        this.codigo = codigo;
        this.cantDePersonas = cantDePersonas;
        this.estacionDeOrigen = estacionDeOrigen;
        this.estacionDeDestino = estacionDeDestino;
    }

    public Double calcularPrecioReserva(){
        double precioBase = cantDePersonas * 50;
        String nombreEstacionOrigen = estacionDeOrigen.getNombre();
        String nombreEstacionDestino = estacionDeDestino.getNombre();
        if (nombreEstacionOrigen.equals("Buenos Aires") && nombreEstacionDestino.equals("Bragado") || nombreEstacionOrigen.equals("Bragado") && nombreEstacionDestino.equals("Buenos Aires")){
            double descuento =  0.2 * precioBase;
            return precioBase - descuento;
        }else{
            return precioBase;
        }

    }

    public Estacion getEstacionDeOrigen() {
        return estacionDeOrigen;
    }


    public Estacion getEstacionDeDestino() {
        return estacionDeDestino;
    }


    public Integer getCantDePersonas() {
        return cantDePersonas;
    }

    @Override
    public String toString() {
        return
                "codigo = '" + codigo + '\'' +
                ", cantDePersonas = " + cantDePersonas +
                ", estacionDeOrigen = " + estacionDeOrigen +
                ", estacionDeDestino = " + estacionDeDestino ;
    }
}
