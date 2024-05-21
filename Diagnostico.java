import java.util.Date;

public class Diagnostico {
    private Date fecha;
    private Enfermedad enfermedad;
    private Medico medico;

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "fecha=" + fecha +
                ", enfermedad=" + enfermedad +
                ", medico=" + medico +
                '}';
    }
}

