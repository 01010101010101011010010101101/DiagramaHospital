import java.util.List;

public class Medico extends Empleado {
    private EspecialidadMedica especialidad;
    private Horario horarioAtencion;
    private Consultorio consultorio;

    public void atenderPaciente(Paciente paciente) {
        System.out.println("Atendiendo al paciente: " + paciente.getNombreCompleto());
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    // Getters y setters adicionales
    public EspecialidadMedica getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadMedica especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(Horario horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
}

