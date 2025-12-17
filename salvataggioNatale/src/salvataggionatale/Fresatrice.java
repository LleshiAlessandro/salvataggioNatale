/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

/**
 *
 * @author aless
 */
public class Fresatrice extends Macchinario{


    public Fresatrice(String nome,CatenaDiMontaggio c) {
        super(nome,c);
    }
    //trova materiale
    public boolean ControllaMateriale(Giocattolo g){
        if(g.getMateriale().equals(Materiale.materiali.cemento)){
            return true;
        }
        else{
            return false;
        }
    }
    

}
