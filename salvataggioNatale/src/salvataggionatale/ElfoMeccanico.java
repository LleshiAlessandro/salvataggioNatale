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
public class ElfoMeccanico extends Elfo{
    
    public ElfoMeccanico(String nome,String s) {
        super(nome,s);
    }
    public void AumentaQualita(Macchinario m){
        int r = new Random().nextInt(1, 11);
        //if meccanico
        if(this.ControllaMacchinario(m)==false){//se l'elfo è meccanico e usa un macchinario meccanico +++qualita se no + o - qualita
            c.setQualita(125*2);
        }
        else if(this.ControllaMacchinario(m)==true){
            if(r >=6) {
                c.setQualita(75);
            }
            else{
                c.setQualita(-100);
            }
        }
    }
}
