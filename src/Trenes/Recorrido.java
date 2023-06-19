package Trenes;

import java.util.List;

public class Recorrido {
    private List <Estacion> estaciones;

    public Recorrido(List<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public Boolean estacionPosible(Estacion estacion){
        for (Estacion estacionRecorrido : estaciones) {
            if(estacionRecorrido.getNombre().equals(estacion.getNombre())){
                return true;
            }
        }
        return false ;
    }

    public void agregarEstacion(Estacion estacion){
        estaciones.add(estacion);
    }
}
