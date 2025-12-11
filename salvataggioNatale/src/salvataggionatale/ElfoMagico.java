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
public class ElfoMagico extends Elfo{
    
    
    
    public ElfoMagico(String nome,String s) {
        super(nome, s);
    }
  
    //metodo per aumentare la magia
    public void aumetnaQualita(Macchinario m){
        int r = new Random().nextInt(1, 11);
        
        //if mago
        if(this.ControllaMacchinario(m)==true){
            c.setQualita(150*2);
        }
        else if(this.ControllaMacchinario(m)==false){
            if(r >=6) {
                c.setQualita(75);
            }
            else{
                c.setQualita(-100);
            }
        }
    }
    
}
