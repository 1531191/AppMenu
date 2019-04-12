package mis.clases.clase;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Personal {

    protected String dni;
    protected String apellidos;
    protected GregorianCalendar fechaIngreso;

    public Personal(String dni, String apellidos, GregorianCalendar fechaIngreso) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {

        int dd, mm, aa;

        dd = fechaIngreso.get(Calendar.DAY_OF_MONTH);
        mm = fechaIngreso.get(Calendar.MONTH) + 1;
        aa = fechaIngreso.get(Calendar.YEAR);

        return "dni=" + dni + ", apellidos=" + apellidos + ", fechaIngreso=" + dd + "/" + mm + "/" + aa;
    }

    public abstract float calcularSalario();

}
