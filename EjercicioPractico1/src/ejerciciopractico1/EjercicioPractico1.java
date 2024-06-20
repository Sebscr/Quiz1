/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico1;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double numeroempleados= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de empleados: "));
         // Se le pide al usuario que ingrese la cantidad de empleados
         for (double i=0; i<numeroempleados; i++){
             // Se crea un ciclo for para limitar la cantidad de veces que preguntaremos la informacion solicitada
                double salarioempleados= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el salario del empleado: "));
             // Se le pide al usuario el salario del empleado
                double SEM= (salarioempleados*0.0925);
                double IVM= (salarioempleados*0.0508);
                double total= (SEM)+(IVM);
             // Mediante varias formulas se calcula el monto que debe de pagar la empresa
                JOptionPane.showMessageDialog(null,"La empresa debera abonar a la CCSS un total de ₡ : "+total+" por concepto de SEM y IVM");
            // Se muestran los resultados
             }
         }      
     
    }
    

