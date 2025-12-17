/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;


/**
 *
 * @author aless
 */
public class Tornio extends Macchinario{


    public Tornio(String nome,CatenaDiMontaggio c) {
        super(nome, c);
    }
    //trova materiale
    public boolean ControllaMateriale(Giocattolo g){
        if(g.getMateriale().equals(Materiale.materiali.legno)){
            return true;
        }
        else{
            return false;
        }
    }
    
    

}
