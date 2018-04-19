
package pruebapreexamen;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: PruebaPreExamen
 * Fecha:18-04-18
 * Version: 3.0
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
        
         do{
            System.out.println("Menu: \n\n1.-INGRESAR\n2.-MOSTRAR\n-1.-SALIR");
            menu = leer.nextInt();
             
            //Añadido desde GitHub
           switch(menu){
               case 1:
                   
                   break;
               case 2:
                   
                   break;
           }
            
            
            
         }while(menu!=-1);
        
    }
    
}
