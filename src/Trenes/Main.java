package Trenes;
import Trenes.Reserva;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        //ESTACIONES
        Estacion estacion = new Estacion("Buenos Aires");
        Estacion estacion1 = new Estacion("Lujan");
        Estacion estacion2 = new Estacion("Mercedes");
        Estacion estacion3 = new Estacion("Suipacha");
        Estacion estacion4 = new Estacion("Chivilcoy");
        Estacion estacion5 = new Estacion("Alberti");
        Estacion estacion6 = new Estacion("Bragado");


        List <Estacion> estacionList = new ArrayList<>();
        estacionList.add(estacion);
        estacionList.add(estacion1);
        estacionList.add(estacion2);
        estacionList.add(estacion3);
        estacionList.add(estacion4);
        estacionList.add(estacion5);
        estacionList.add(estacion6);


        Recorrido recorrido = new Recorrido(estacionList);

        //implemento el metodo agregarEstacion en la ( clase recorrido )
        // para hacer escalable el software en el caso de que el recorrido tenga nuevas estaciones.
        Estacion estacion7 = new Estacion("9 de julio");
        recorrido.agregarEstacion(estacion7);

        for (Estacion estaciones : estacionList) {
            System.out.println("Estacion ingresada " + estaciones );
            // Se recorren todas las estaciones de la lista estacionList.
            // y se verifica si cada estación está en el recorrido utilizando el método estacionPosible(), el mismo determina
            //  Si una estación está en el recorrido y retorna un valor booleano (true si está en el recorrido, false si no está).
            //  Por lo tanto, al llamar a este método dentro del condicional if,
            //  se está evaluando si la estación actual del bucle está en el recorrido.
            if (recorrido.estacionPosible(estaciones)){
                System.out.println("La estacion es posible dentro del recorrido");
            }else {
                System.out.println("la estacion no es posible dentro del recorrido");
            }
        }


        //RESERVAS
        Reserva reserva0 = new Reserva("001", 3, estacionList.get(0), estacionList.get(6));
        Reserva reserva1 = new Reserva("002", 4, estacionList.get(0), estacionList.get(4));
        Reserva reserva2 = new Reserva("003", 3, estacionList.get(1), estacionList.get(3));
        Reserva reserva3 = new Reserva("004", 1, estacionList.get(2), estacionList.get(4));


        List <Reserva> reservaList = new ArrayList<>();
        reservaList.add(reserva0);
        reservaList.add(reserva1);
        reservaList.add(reserva2);
        reservaList.add(reserva3);

        for (Reserva reserva : reservaList) {
            System.out.println("Detalle reserva " + reserva + ", importe $ " + reserva.calcularPrecioReserva());
        }

        // implementamos el metodo recaudacionTotal() y a su vez verificamos si las extaciones existen
        Empresa empresa1 = new Empresa(reservaList, recorrido);
        System.out.println("La recaudacion total de la " + empresa1 + "es de $ " + empresa1.recaudacionTotal());
        for (Estacion estacionExistente : estacionList){
            if (empresa1.existeEstacion(estacionExistente)) {
                System.out.println("La estación " + estacionExistente + " existe en el recorrido.");
            } else {
                System.out.println("La estación " + estacionExistente + " no existe en el recorrido.");
            }
        }

        // Llamar al método cantVecesRecorrida para cada estación existente
        try{
            for (Estacion estacionesPosibles : estacionList)
                System.out.println("La estacion " + estacionesPosibles  + " ha sido recorrida por " + empresa1.cantVecesRecorrida(estacionesPosibles) + " personas ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        }
    }
