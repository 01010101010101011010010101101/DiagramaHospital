import java.util.Date;

public class Prescripcion {
    private Date fecha;
    private Medicamento medicamento;
    private String dosis;
    private Medico medico;

    // Getters y setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Prescripcion{" +
                "fecha=" + fecha +
                ", medicamento=" + medicamento +
                ", dosis='" + dosis + '\'' +
                ", medico=" + medico +
                '}';
    }
}

