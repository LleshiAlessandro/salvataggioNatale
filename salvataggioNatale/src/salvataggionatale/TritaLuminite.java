/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

/**
 *
 * @author aless
 */
public class TritaLuminite extends Macchinario{


    public TritaLuminite(String nome,CatenaDiMontaggio c) {
        super(nome,c);
    }
    //trova materiale
    public boolean ControllaMateriale(Giocattolo g){
        if(g.getMateriale().equals(Materiale.materiali.luminite)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
