import javax.swing.*;

public class Main {
    public static void main(String args[]){
        AgendaUAO  agenda = new AgendaUAO();
        EstudianteUAO est;

        for(int i = 1; i <=5; i++){
            est = crearEstudianteUAO();
            agenda.agregarContacto(est);
        }
        System.out.println(agenda.toString());

    }

    private static EstudianteUAO crearEstudianteUAO(){
        String nombre, tel, email, carrera;

        nombre = JOptionPane.showInputDialog("Digite el nombre: ");
        tel= JOptionPane.showInputDialog("digite el telefono: ");
        email = JOptionPane.showInputDialog("Digite el email: ");
        carrera = JOptionPane.showInputDialog("Digite el nombre de la carrera");


        return new  EstudianteUAO(nombre,tel,email,carrera);
    }
}
