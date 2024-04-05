
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YULIETH
 */
public class Competencia {
    
private ArrayList <Atleta>Atletas ;
     
    public Competencia() {
        
        ArrayList<Atleta> Atletas = new ArrayList<Atleta>();
        
    }
    public void nuevoAtleta(){
        Atletas.add(new Atleta("Pepito", "Colombiano", 2, 4));
    }
}
