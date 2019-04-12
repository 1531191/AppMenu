package mis.clases.java;

import java.util.GregorianCalendar;
import java.util.Scanner;
import mis.clases.gestion.GestionPersonal;

public class Prueba {

    public static void main(String[] args) {
        GestionPersonal refG = new GestionPersonal();

        String dni = "", ape = "";
        int op, dd, mm, aa;

        GregorianCalendar fIngreso = null;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\n Menu de Opciones");
            System.out.println("---------------------------------");
            System.out.println("1. Registrar Empleado Contratado \n");
            System.out.println("2. Registrar Empleado Destajo \n");
            System.out.println("3. Mostrar salarios por Empleado\n");
            System.out.println("4. Salir\n");
            System.out.println("\n Opcion :");
            op = sc.nextInt();
            
            if (op == 1 || op==2) {
                
                System.out.println("Ingrese DNI : ");
                dni = sc.next();
                 System.out.println("Ingrese apellidos : ");
                 ape = sc.next();
                 System.out.println("Dia :  ");
                 dd = sc.nextInt();
                  System.out.println("Mes] (1-12) :  ");
                  mm = sc.nextInt();
                  System.out.println("Año :  ");
                  aa= sc.nextInt();
                  
                  fIngreso = new GregorianCalendar(aa,mm-1,dd);
            }
            
            
            
            
        } while (op!=4);
        
        

    }

}
