/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

import java.util.Random;

/**
 *
 * @author aless
 */
public class TagliaDiamanti extends Macchinario{
    
    CatenaDiMontaggio c;
    
    public TagliaDiamanti(String nome) {
        super(nome);
    }
    
    //trova materiale
    public boolean ControllaMateriale(Giocattolo g){
        if(g.getMateriale().equals(Materiale.materiali.diamanti)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    public void AumentaQualita(Giocattolo g){
        int r = new Random().nextInt(1, 11);
        if (this.ControllaMateriale(g)){
            c.setQualita(125*2);
        }
        else if (!this.ControllaMateriale(g)){
            if(r >=6) {
                c.setQualita(25);
            }
            else{
                c.setQualita(-75);
            }
        }
    }
}
