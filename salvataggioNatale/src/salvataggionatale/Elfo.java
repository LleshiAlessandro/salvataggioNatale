/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author aless
 */
public class Elfo {
    private String nome;
    private int abilitaMeccanica;
    private String s;
    private int stanchezza;
    private int abilitaMagica;
    int rdn = new Random().nextInt(1, 2);
    
    
    //costruttroe della classe
    public Elfo(String nome, String s){
        this.nome = nome;
        this.s = s;
    }
    
    //get e set del nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    //get e set della specializzazione
    public void setSpecializzazione(String s){
        this.s = s;
    }
    public String getSpecializzazione(){
        return s;
    }
    
    //get e set dell'abilità meccanica
    public void setMeccanica(int abilitaMeccanica){
        this.abilitaMeccanica = abilitaMeccanica;
    }
    public int getMeccanica(){
        return abilitaMeccanica;
    }
    
    //get e set dell'abilità magica
    public void setMagia(int abilitaMagica){
        this.abilitaMagica = abilitaMagica;
    }
    public int getMagia(){
        return abilitaMagica;
    }
    
    //get e set della stanchezza
    public void setStanchezza(int stanchezza){
        this.stanchezza = stanchezza;
    }
    public int getStanchezza(){
        return stanchezza;
    }
    public String tipoElfo(){
        if(rdn == 1){
            return s = "meccanico";
        }
        else if(rdn == 2){
            return s = "mago";
        }
        return "errore";
    }
}
