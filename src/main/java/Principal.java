
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author YULIETH
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        
        boolean x = true ;
        while (x){
        String menu = JOptionPane.showInputDialog("*****COMPETENCIA***** \n"+"1. Registrar atleta \n"
        +"2. Datos del campeon \n"
        +"3. Atletas por pais\n"
        + "4. tiempo promedio de todos los atletas\n "
        + "5. salir");
        
        int menuStr=Integer.parseInt(menu);
        switch (menuStr){
            case 1 :
                      String nombreAtlete= JOptionPane.showInputDialog("ingresa nombre");
            break ;
            
            case 2 :
                
                String nombreCampeon= JOptionPane.showInputDialog("ingresa nombre");
                String nacionalidad= JOptionPane.showInputDialog("ingresa nacionalidad");
                String Tiempo = JOptionPane.showInputDialog("ingresar tiempo");
                break ;
                
            case 3 :
                
                break ;
                
            case 4 :
                break ;
                
            case 5 :
                x = false ;
                break ;
                
                default:
                    System.out.println("opcion no valida ");
              break ;



        }
        }
    }
    
}
