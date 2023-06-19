package Trenes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Reserva> reservaList ;
    private Recorrido estaciones;


    public Empresa(List<Reserva> reservaList, Recorrido estaciones) {
        this.reservaList = reservaList;
        this.estaciones = estaciones;
    }

    public Empresa(){

    }
    // monto total recaudado según el precio de todas las reservas.
    public double recaudacionTotal(){
        double recaudacionTotal = 0.0;
        for (Reserva reserva : reservaList) {
            double precioReserva = reserva.calcularPrecioReserva();
            recaudacionTotal += precioReserva;
        }
        return recaudacionTotal;
    }

    public int cantVecesRecorrida(Estacion estacion) throws Exception {

        // Se inicializa la variable cantPersonas como 0,
        // que se utilizará para llevar el conteo de la cantidad de personas que han recorrido la estación.
        int cantPersonas = 0;

        // Se verifica si la estación proporcionada como argumento existe en el recorrido utilizando el método estacionPosible de la clase Recorrido.
        // Si la estación no existe, se lanza una excepción.
        if (! estaciones.estacionPosible(estacion)){
            throw new Exception("La estación no corresponde a ninguna de las estaciones correspondientes al recorrido.");
        }
        // Si la estación existe, se procede a recorrer cada reserva en la lista reservaList
        for (Reserva reserva : reservaList) {
            // Para cada reserva, se obtienen las estaciones de origen y destino
            // utilizando los métodos getEstacionOrigen y getEstacionDestino respectivamente.
            // Se compara si la estación proporcionada coincide con la estación de origen o destino de la reserva actual.
            if (reserva.getEstacionDeOrigen().equals(estacion) || reserva.getEstacionDeDestino().equals(estacion)){
                //se devuelve el valor de cantPersonas, que representa la cantidad total de personas que han recorrido la estación especificada.
                cantPersonas += reserva.getCantDePersonas();
            }

        }

        return cantPersonas;
    }

    public boolean existeEstacion(Estacion estacion){
        if(estaciones.estacionPosible(estacion).equals(true)){
            return true;
        }else{
            return false;
        }
    }

    public Recorrido getEstaciones() {
        return estaciones;
    }

    @Override
    public String toString() {
        return "Empresa ";

    }
}
