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
public class Elfo {
    private String nome;
    protected ArrayList <String> specializzazione = new ArrayList();//qua capisco se il mio elfo è un meccanico o un mago
    private int abilitaMeccanica;
    private int stanchezza;
    private int abilitaMagica;
    
    //costruttroe della classe
    public Elfo(String nome, ArrayList <String> specializzazione){
        this.nome = nome;
        this.specializzazione = specializzazione;
    }
    
    //get e set del nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    //get e set della specializzazione
    public void setSpecializzazione(ArrayList specializzazione){
        this.specializzazione = specializzazione;
    }
    public <String> ArrayList getSpecializzazione(){
        return specializzazione;
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
    
}
