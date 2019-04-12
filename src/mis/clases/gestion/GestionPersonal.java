package mis.clases.gestion;

import java.util.ArrayList;
import mis.clases.clase.PDestajo;
import mis.clases.clase.Personal;

public class GestionPersonal {

    private ArrayList<Personal> listaP;

    public GestionPersonal() {

        listaP = new ArrayList<Personal>();

    }

    public void agregarPersonal(Personal refP) {
        listaP.add(refP);
    }

    public String listaEmpleado() {

        String cad = " ";

        for (int i = 0; i < listaP.size(); i++) {
            cad += "\n\tEmpleado " + (i + 1) + " : " + listaP.get(i);
        }

        return cad;
    }

    public void buscarEDMayoresClientes() {

        int mayor = 0;
        PDestajo ref = null;
        String nombreED = "";
        for (int i = 0; i < listaP.size(); i++) {

            if (listaP.get(i) instanceof PDestajo) {
                ref = (PDestajo) listaP.get(i);
                if (ref.getCantClientes() > mayor) {
                    mayor = ref.getCantClientes();
                    nombreED = ref.getApellidos();
                }

            }

        }

        System.out.println("Datos del empleado : " + nombreED);
    }

}
