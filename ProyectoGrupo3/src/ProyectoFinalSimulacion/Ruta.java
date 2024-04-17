package ProyectoFinalSimulacion;

import java.time.LocalDateTime;

/**
 *
 * @author Grupo 3
 */

public class Ruta {
    
    //atributos
    private String nombre;
    private String ubicacionInicio;
    private String ubicacionDestino;
    private LocalDateTime horaInicio;
    private int duracion; //la duración debe ser en minutos

    //constructores
    public Ruta() {
    }

    public Ruta(String nombre, String ubicacionInicio, String ubicacionDestino, LocalDateTime now, int duracion) {
        this.nombre = nombre;
        this.ubicacionInicio = ubicacionInicio;
        this.ubicacionDestino = ubicacionDestino;
        this.horaInicio = LocalDateTime.now(); //la fecha y hora actual
        this.duracion = duracion;
    }

    //encapsuladores = Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacionInicio() {
        return ubicacionInicio;
    }

    public void setUbicacionInicio(String ubicacionInicio) {
        this.ubicacionInicio = ubicacionInicio;
    }

    public String getUbicacionDestino() {
        return ubicacionDestino;
    }

    public void setUbicacionDestino(String ubicacionDestino) {
        this.ubicacionDestino = ubicacionDestino;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //metodo para obtener la hora de llegada basada en la hora de inicio y la duracion
    public LocalDateTime getHoraLlegada() {
        return horaInicio.plusMinutes(duracion);
    }

    //metodo toString para representación de cadena de la ruta
    @Override
    public String toString() {
        return "Nombre de la ruta: " + nombre + "\n" +
               "Ubicación de inicio: " + ubicacionInicio + "\n" +
               "Ubicación de destino: " + ubicacionDestino + "\n" +
               "Hora de inicio: " + horaInicio.toString() + "\n" +
               "Duración: " + duracion + " minutos\n" +
               "Hora de llegada: " + getHoraLlegada().toString();
    }
    
}//fin de la clase
