/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

/**
 *
 * @author aless
 */
public class Materiale {
    
    
    public enum materiali{
        diamanti,
        legno,
        ghiaccio,
        cemento,
        luminite;
    }
    
    public materiali ConvertiMateriale(String s){
        for (materiali x : materiali.values()){
            if(String.valueOf(x).equals(s)){
                return x;
            }
        }
        return null;
    }
}
