package Trenes;

public class Estacion {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre ;

    }
}
