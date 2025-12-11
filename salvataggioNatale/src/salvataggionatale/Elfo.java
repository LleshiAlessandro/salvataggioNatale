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
public class Elfo {
    private String nome;
    private int abilitaMeccanica;
    private String specializzazione;
    private int stanchezza;
    private int abilitaMagica;

    CatenaDiMontaggio c = new CatenaDiMontaggio();
    
    //costruttroe della classe
    public Elfo(String nome, String s){
        this.nome = nome;
        this.specializzazione = s;
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
        this.specializzazione = s;
    }
    public String getSpecializzazione(){
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
    
    //controllo tipo elfo
    public static String tipoElfo(){
        int rdn = new Random().nextInt(1, 3);
        if(rdn == 1){
            return "meccanico";
        }
        else if(rdn == 2){
            return "mago";
        }
        return "errore";
    }
    
    //controlla macchinario
    public boolean ControllaMacchinario(Macchinario m){
        if(m.nome.equals("tornio")){
            return false;
        }
        else if(m.nome.equals("fresatrice")){
            return false;
        }
        else if(m.nome.equals("taglia diamanti")){
            return false;
        }
        else if(m.nome.equals("trita luminite")){
            return true;
        }
        else if(m.nome.equals("estrusore di ghiaccio")){
            return true;
        }
        else{
            System.out.println(" c'e' stato qualche errore nella scelta del macchinario ");
        }
        return false;
    }
    

    
    
    //to string
    @Override
    public String toString(){
        return " nome elfo: " + nome + " specializzazione: " + specializzazione;
    }
}
