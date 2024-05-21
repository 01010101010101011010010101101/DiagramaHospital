import java.util.ArrayList;
import java.util.List;

public class ExpedienteMedico {
    private List<Diagnostico> diagnosticos = new ArrayList<>();
    private List<Tratamiento> tratamientos = new ArrayList<>();
    private List<Prescripcion> prescripciones = new ArrayList<>();

    public void agregarDiagnostico(Diagnostico diagnostico) {
        diagnosticos.add(diagnostico);
        System.out.println("Diagnóstico agregado: " + diagnostico);
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        tratamientos.add(tratamiento);
        System.out.println("Tratamiento agregado: " + tratamiento);
    }

    public void agregarPrescripcion(Prescripcion prescripcion) {
        prescripciones.add(prescripcion);
        System.out.println("Prescripción agregada: " + prescripcion);
    }

    // Getters y setters
    public List<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(List<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public List<Prescripcion> getPrescripciones() {
        return prescripciones;
    }

    public void setPrescripciones(List<Prescripcion> prescripciones) {
        this.prescripciones = prescripciones;
    }
}
