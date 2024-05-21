import java.util.List;
import java.util.ArrayList;

public class Paciente extends Persona {
    private List<Enfermedad> enfermedades = new ArrayList<>();
    private List<Alergia> alergias = new ArrayList<>();
    private ExpedienteMedico expedienteMedico = new ExpedienteMedico();

    public void registrarCita(Cita cita) {
        // Implementación para registrar la cita
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public List<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }

    public ExpedienteMedico getExpedienteMedico() {
        return expedienteMedico;
    }

    public void setExpedienteMedico(ExpedienteMedico expedienteMedico) {
        this.expedienteMedico = expedienteMedico;
    }
}

