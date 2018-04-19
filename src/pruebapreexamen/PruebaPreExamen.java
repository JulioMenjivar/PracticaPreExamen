
package pruebapreexamen;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: PruebaPreExamen
 * Fecha:18-04-18
 * Version: 1.0
 * CopyRight: JulioMenjivar
 * @author JulioMenjivar
 */
public class PruebaPreExamen {
    
    public static void main(String[] args) {
        //variables 
        String nombre[] = new String[999];
        int edad[] = new int[999];
        
        //contadores y acumuladores
        int menu=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Menu: \n\n1.-INGRESAR\n2.-MOSTRAR");
        menu = leer.nextInt();
        //Añadido desde GitHub
         System.out.println("menu: "+menu);
        
    }
    
}
