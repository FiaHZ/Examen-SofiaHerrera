package Hospital;

/**
 *
 * @author Student
 */
public class Pacientes {

    private int cedula;
    private String nombre;
    private String fecha;
    private String horaLlegada;
    private String horaSalida;
    private String clasificacion;

    public Pacientes(int cedula, String nombre, String fecha, String horaLlegada, String horaSalida, String clasificacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.clasificacion = clasificacion;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    @Override
    public String toString() {
        return "Cedula= " + cedula + " Nombre= " + nombre + " Fecha= " + fecha + " Hora de llegada= " + horaLlegada + " Hora de salida= " + horaSalida + " Clasificacion= " + clasificacion;
    }

}
