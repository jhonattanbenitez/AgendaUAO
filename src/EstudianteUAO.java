public class EstudianteUAO extends Persona {
    private String carrera; // Programa académico.

    public EstudianteUAO(String nombre, String tel, String email, String carrera) {
        super(nombre, tel, email);
        this.carrera = carrera.trim().toUpperCase();
    }

    public String getCarrera() { return carrera; }

    public void setCarrera(String carrera) { this.carrera = carrera.trim().toUpperCase(); }

    @Override
    public String toString() {
        return super.toString() + "\n Estudiante UAO" +
                "carrera:'" + carrera + '\'';
    }
}
