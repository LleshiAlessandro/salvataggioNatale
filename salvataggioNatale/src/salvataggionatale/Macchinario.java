/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

/**
 *
 * @author aless
 */
public class Macchinario {
    String nome;
    private int usura;
    private int qualitaMeccanica;
    private int qualitaMagica;
    
    //costruttore della classe
    public Macchinario(String nome){
        this.nome = nome;
    }
    
    //get e set del nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    //get e set della qualità  meccanica
    public void setMeccanica(int qualitaMeccanica){
        this.qualitaMeccanica = qualitaMeccanica;
    }
    public int getMeccanica(){
        return qualitaMeccanica;
    }
    
    //get e set della qualità magica
    public void setMagia(int qualitaMagica){
        this.qualitaMagica = qualitaMagica;
    }
    public int getMagia(){
        return qualitaMagica;
    }
    
    //get e set dell' usura
    public void setStanchezza(int usura){
        this.usura = usura;
    }
    public int getStanchezza(){
        return usura;
    }
    
    //to string
    @Override
    public String toString(){
        return " nome macchinario: " + nome;
    }
}
