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
    private ArrayList <Elfo> elfi = new ArrayList();
    private ArrayList <Macchinario> macchinari = new ArrayList();
    
    //numero elfi
    public int getNumElfi(){
        return elfi.size();
    }
    //add elfi
    public void addElfi(Elfo e){
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
}