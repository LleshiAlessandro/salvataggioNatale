/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

/**
 *
 * @author aless
 */
public class EstrusoreDiGhiaccio extends Macchinario{

    public EstrusoreDiGhiaccio(String nome,CatenaDiMontaggio c) {
        super(nome,c);
    }
    //trova materiale
    public boolean ControllaMateriale(Giocattolo g){
        if(g.getMateriale().equals(Materiale.materiali.ghiaccio)){
            return true;
        }
        else{
            return false;
        }
    }

}
