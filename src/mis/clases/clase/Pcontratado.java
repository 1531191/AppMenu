package mis.clases.clase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pcontratado extends Personal {

    private float sueldoB;

    public Pcontratado(String dni, String apellidos, GregorianCalendar fechaIngreso) {
        super(dni, apellidos, fechaIngreso);
        this.sueldoB = sueldoB;
    }

    

    public float getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(float sueldoB) {
        this.sueldoB = sueldoB;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario : " + calcularSalario();
    }

    public float calcularSalario() {

        float salario;
        GregorianCalendar factual = new GregorianCalendar();

        int añosTrans = factual.get(Calendar.YEAR) - getFechaIngreso().get(Calendar.YEAR);
        if (getFechaIngreso().get(Calendar.MONTH) > factual.get(Calendar.MONTH) || getFechaIngreso().get(Calendar.MONTH) == factual.get(Calendar.MONTH) && getFechaIngreso().get(Calendar.DAY_OF_MONTH) > factual.get(Calendar.DAY_OF_MONTH)) {
            añosTrans--;
        }

        if (añosTrans <= 3) {
            salario = 1.05f * sueldoB;

        } else if (añosTrans > 3 && añosTrans <= 7) {
            salario = 1.1f * sueldoB;
        } else if (añosTrans > 7 && añosTrans <= 15) {
            salario = 1.15f * sueldoB;
        } else {
            salario = 1.20f * sueldoB;
        }

        return salario;

    }

}
