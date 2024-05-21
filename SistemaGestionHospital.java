import java.util.ArrayList;
import java.util.List;

public class SistemaGestionHospital {
    private List<Cita> citas = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Enfermero> enfermeros = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();

    public void programarCita(Cita cita) {
        citas.add(cita);
        System.out.println("Cita programada: " + cita);
    }

    public void cancelarCita(Cita cita) {
        citas.remove(cita);
        System.out.println("Cita cancelada: " + cita);
    }

    public void asignarMedicoACita(Cita cita, Medico medico) {
        cita.setMedico(medico);
        System.out.println("Médico asignado a la cita: " + cita);
    }

    public void asignarEnfermeroAMedico(Medico medico, Enfermero enfermero) {
        System.out.println("Enfermero asignado al médico: " + medico.getEspecialidad());
    }

    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente registrado: " + paciente.getNombreCompleto());
    }

    // Getters y setters
    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public List<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(List<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}
