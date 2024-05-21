public class Enfermero extends Empleado {
    private String areaTrabajo;

    public void asistirMedico(Medico medico) {
        System.out.println("Asistiendo al médico: " + medico.getEspecialidad());
    }

    // Getters y setters
    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
}

