package Hospital;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaPacientes {

    private ArrayList<Pacientes> paciente;

    public ListaPacientes() {
        this.paciente = new ArrayList<>();
    }

    public void Agregar(Pacientes p) {
        paciente.add(p);
    }

    public void mostrar() {
        for (Pacientes p : paciente) {
            System.out.println(p);
        }
    }

    

}
