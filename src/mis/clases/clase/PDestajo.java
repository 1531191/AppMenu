package mis.clases.clase;

import java.util.GregorianCalendar;

public class PDestajo extends Personal {

    private static final float SALARIO = 130.0f;
    private int cantClientes;

    public PDestajo(String dni, String apellidos, GregorianCalendar fechaIngreso) {
        super(dni, apellidos, fechaIngreso);
        this.cantClientes = cantClientes;
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public String toString() {
        return super.toString() + "\nSalario : " + calcularSalario();
    }

    public float calcularSalario() {
        return cantClientes * SALARIO; //To change body of generated methods, choose Tools | Templates.
    }

}
