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
        int n = new Random().nextInt(1, 101);

        if(n <= 10 && n>=0){
            return cioccolata_calda;
        }
        else if(n >= 11 && n <= 60){
             return guasto_catena;
        }
        else{
            return magia_del_natale;
        }
    }
        
}

