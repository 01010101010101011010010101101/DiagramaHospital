import java.util.Date;

public class Cita {
    private Date fecha;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private EstadoCita estado;

    public void confirmarCita() {
        this.estado = EstadoCita.PROGRAMADA;
        System.out.println("Cita confirmada: " + this);
    }

    public void cancelarCita() {
        this.estado = EstadoCita.CANCELADA;
        System.out.println("Cita cancelada: " + this);
    }

    public void reprogramarCita(Date nuevaFecha, String nuevaHora) {
        this.fecha = nuevaFecha;
        this.hora = nuevaHora;
        System.out.println("Cita reprogramada: " + this);
    }

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", medico=" + medico +
                ", paciente=" + paciente +
                ", estado=" + estado +
                '}';
    }
}

