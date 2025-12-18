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
public enum EventManager {
    cioccolata_calda,
    guasto_catena,
    magia_del_natale;
        
    public static EventManager GestioneEventi(){
        Random n = new Random();
        int j = n.nextInt(0, 11);

        if(j>=0 && j <= 1){
            return magia_del_natale;
        }
        else if(j >= 2 && j <= 4){
             return guasto_catena;
        }
        else if(j >= 5 && j <=10){
            return cioccolata_calda;
        }
        return null;
    }
        
}

