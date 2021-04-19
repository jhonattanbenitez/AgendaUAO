import java.util.ArrayList;

public class AgendaUAO {
    private ArrayList<EstudianteUAO> contactos;

    public AgendaUAO() {
        //Crea una agenda vacía
        contactos = new ArrayList<>();
    }
    public void agregarContacto(EstudianteUAO est){
        contactos.add(est);
    }

    @Override
    public String toString() {
        String report = "Contactos UAO: \n";
        for(int i = 0; i< contactos.size(); i++ ){
            report += contactos.get(i).toString() + "\n";
        }
        return report;
    }
}
