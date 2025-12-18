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
    private String specializzazione;

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
        if(m.nome.equals("trita luminite")  || m.nome.equals("estrusore di ghiaccio")){
            return true;
        }
        return false;
    }

    //to string
    @Override
    public String toString(){
        return " nome elfo: " + nome + " specializzazione: " + specializzazione;
    }
}
