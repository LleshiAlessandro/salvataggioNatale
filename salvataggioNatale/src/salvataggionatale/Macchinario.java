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
public class Macchinario {
    String nome;
    private int usura;
    private int qualitaMeccanica;
    private int qualitaMagica;
    private Giocattolo g;
    CatenaDiMontaggio c;

    
    //costruttore della classe
    public Macchinario(String nome, CatenaDiMontaggio c){
        this.nome = nome;
        this.c = c;
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
    
    public void AumentaQualita(Giocattolo g, ArrayList<String> nomiMacchinari){
        if (nomiMacchinari.contains("tornio")){
            if(new Tornio("tornio", c).ControllaMateriale(g)){
            c.setQualita(125*2);
            }
        }
        else if (nomiMacchinari.contains("taglia diamanti")){
            if(new TagliaDiamanti("taglia diamanti", c).ControllaMateriale(g)){
            c.setQualita(125*2);
            }
        }

        else if (nomiMacchinari.contains("trita luminite")){
            if(new TritaLuminite("trita luminite", c).ControllaMateriale(g)){
            c.setQualita(125*2);
            }
        }

        else if (nomiMacchinari.contains("fresatrice")){
            if(new Fresatrice("fresatrice", c).ControllaMateriale(g)){
            c.setQualita(125*2);
            }
        }

        else if (nomiMacchinari.contains("estrusore di ghiaccio")){
            if(new EstrusoreDiGhiaccio("estrusore di ghiaccio", c).ControllaMateriale(g)){
            c.setQualita(125*2);
            }
        }
    }
    
    
    
    //to string
    @Override
    public String toString(){
        return " nome macchinario: " + nome;
    }
}
