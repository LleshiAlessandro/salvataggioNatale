/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

import java.util.ArrayList;

/**
 *
 * @author aless
 */
public class CatenaDiMontaggio {
    private int qualita = 0;
    ArrayList <String> elfi = new ArrayList();
    ArrayList <String> macchinari = new ArrayList();
    EventManager e;
    
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
    public void addMacchinari(String e){
        macchinari.add(e);
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
    
    public String controllaMacchinario(String e){
        if(macchinari.contains(e)){
            switch (e) {
                case "tornio":
                    return "/salvataggionatale/elfi/tornio.png";
                case "fresatrice":
                    return "/salvataggionatale/elfi/fresatrice.png";
                case "taglia diamanti":
                    return "/salvataggionatale/elfi/taglia diamanti.png";
                case "trita luminite":
                    return "/salvataggionatale/elfi/trita luminite.png";
                case "estrusore di ghiaccio":
                    return "/salvataggionatale/elfi/estrusore di ghiaccio.png";
                default:
                    break;
            }
        }
        return "";
    }
    
    public void events(){
        switch (EventManager.GestioneEventi()) {
            case cioccolata_calda:
                setQualita(30);
                break;
            case guasto_catena:
                setQualita(-75);
                break;
            case magia_del_natale:
                setQualita(100);
                break;
            default:
                break;
        }
    }
}