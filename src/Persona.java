public class Persona {
    private String nombre, tel, email;

    public Persona(String nombre, String tel, String email) {
        this.nombre = nombre.trim().toUpperCase();
        this.tel = tel.trim();
        this.email = email.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { this.nombre = nombre.trim().toUpperCase(); }

    public String getTel() { return tel; }

    public void setTel(String tel) { this.tel = tel.trim(); }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email.trim();  }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
