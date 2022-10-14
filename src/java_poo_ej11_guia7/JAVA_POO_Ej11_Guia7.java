/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
*/

package java_poo_ej11_guia7;

import java.time.LocalDate;
import javax.swing.JOptionPane;


public class JAVA_POO_Ej11_Guia7 {

    public static void main(String[] args) {


        int dia = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el número de día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el número de mes"));
        int anio= Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese el número de año"));
        
   //LocalDateTime fecha = LocalDateTime(anio, mes, dia);
   
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        
        System.out.println("La fecha ingresada es: " + fecha);
        System.out.println("\nLa diferencia de fecha en años es:");
        System.out.println((int)(fechaActual.getYear()) - (int)(fecha.getYear()));
        
        System.out.println("\nSi las dos fechas son del mismo año, mostraremos aquí la diferencia en meses o días: ");
        System.out.println(fechaActual.compareTo(fecha));
        
        JOptionPane.showMessageDialog(null, "la diferencia en años, meses ó días es: " + fechaActual.compareTo(fecha) );
    }
    
}
