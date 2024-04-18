package ProyectoFinalSimulacion;

import java.time.LocalDateTime;

public class Ruta {

    private String nombre;
    private String ubicacionInicio;
    private String ubicacionDestino;
    private LocalDateTime horaInicio;
    private int duracion;

    public Ruta() {
    }

    public Ruta(String nombre, String ubicacionInicio, String ubicacionDestino, LocalDateTime now, int duracion) {
        this.nombre = nombre;
        this.ubicacionInicio = ubicacionInicio;
        this.ubicacionDestino = ubicacionDestino;
        this.horaInicio = LocalDateTime.now();
        this.duracion = duracion;
    }

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

    public LocalDateTime getHoraLlegada() {
        return horaInicio.plusMinutes(duracion);
    }

    @Override
    public String toString() {
        return "Nombre de la ruta: " + nombre + "\n"
                + "Ubicación de inicio: " + ubicacionInicio + "\n"
                + "Ubicación de destino: " + ubicacionDestino + "\n"
                + "Hora de inicio: " + horaInicio.toString() + "\n"
                + "Duración: " + duracion + " minutos\n"
                + "Hora de llegada: " + getHoraLlegada().toString();
    }
}
