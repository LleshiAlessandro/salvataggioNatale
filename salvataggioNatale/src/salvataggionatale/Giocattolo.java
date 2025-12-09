/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salvataggionatale;

/**
 *
 * @author aless
 */
public class Giocattolo {
    private String nome;
    private Materiale materiale;
    
    public Giocattolo(String nome,Materiale materiale){
        this.nome = nome;
        this.materiale = materiale;
    }
    
    //get e set del nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    //set e get materiali
    public void setMateriale(Materiale materiale){
        this.materiale = materiale;
    }
    public Materiale getMateriale(){
        return materiale;
    }
    
    //to string
    @Override
    public String toString(){
        return " giocattolo scelto: " + nome;
    }
}
