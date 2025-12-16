/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author aless
 */
public class CatenaDiMontaggio {
    private int qualita = 0;
    ArrayList <String> elfi = new ArrayList();
    ArrayList <Macchinario> macchinari = new ArrayList();
    
    //numero elfi
    public int getNumElfi(){
        return elfi.size();
    }
    //add elfi
    public void addElfi(String e){
        elfi.add(e);
    }
    
    //numero macchinari
    public int getNumMacchinari(){
        return macchinari.size();
    }
    //add mecchinari
    public void addMacchinari(Macchinario m){
        macchinari.add(m);
    }
    
    //get e set qualita
    public void setQualita(int qualita){
        this.qualita += qualita;
    }
    public int getQualita(){
        return qualita;
    }
    
    public String controllaElfo(String e){
        
        if(elfi.contains(e)){
            switch (e) {
                case "augusto":
                    return "/salvataggionatale/elfi/augusto.jpg";
                case "gabriele":
                    return "/salvataggionatale/elfi/gabriele.jpg";
                case "pietro":
                    return "/salvataggionatale/elfi/pietro.jpg";
                default:
                    break;
            }
        }
        return "";
    }
}