/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramon
 */

public class Personagem extends Objeto{ 

    private static int NovoId() {
        String config = "";
        ArrayList<Personagem> todos = new ArrayList<>();
        
        try {
            config = Arquivo.leitor("config");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
        int retorno = 0;
        if(!config.equals("")){
            String dados[] = config.split(";");
            retorno = Integer.parseInt(dados[0]);
            config = (retorno+1)+"";
            for(int i=1; i < dados.length; i++)
                config += dados[i];
            try {
                Arquivo.escritor(config, "config");
            } catch (IOException ex) {
                Logger.getLogger(Personagem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return retorno;
    }

    private String nome;
    private String tendencia;
    private int forca;
    private int destreza;
    private int contituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private int id;
    
    public Personagem(
                        int id,
                        String nome, 
                        String tendencia, 
                        int forca,
                        int destreza,
                        int contituicao,
                        int inteligencia,
                        int sabedoria,
                        int carisma
                    ){
        this.nome = nome; 
        this.tendencia = tendencia; 
        this.forca = forca;
        this.destreza = destreza;
        this.contituicao = contituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
        this.id = id;
    }

    public Personagem() {
        
    }

    public Personagem(String ler) {
        String p[] = ler.split("§");
        id = Personagem.NovoId();
        nome = p[0];
        tendencia = p[1];
        forca = Integer.parseInt(p[2]);
        destreza = Integer.parseInt(p[3]);
        contituicao = Integer.parseInt(p[4]);
        inteligencia = Integer.parseInt(p[5]);
        sabedoria = Integer.parseInt(p[6]);
        carisma = Integer.parseInt(p[7]);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getTendencia() {
        return tendencia;
    }

    public void setTendencia(String Tendencia) {
        this.tendencia = Tendencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForça(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getContituicao() {
        return contituicao;
    }

    public void setContituicao(int contituicao) {
        this.contituicao = contituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligência(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }       
    
    public static void salvar(ArrayList<Personagem> p){
        String pers = "";
        for (Personagem p1 : p) {
            pers += p1.id+"§"+
                    p1.nome+"§"+
                    p1.tendencia+"§"+
                    p1.forca+"§"+
                    p1.destreza+"§"+
                    p1.contituicao+"§"+
                    p1.inteligencia+"§"+
                    p1.sabedoria+"§"+
                    p1.carisma+"¢";
        }
        try {
            Arquivo.escritor(pers, "personagem");
        } catch (IOException ex) {
            Logger.getLogger(Personagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public static ArrayList<Personagem> carregar(){
        String personagens = "";
        ArrayList<Personagem> todos = new ArrayList<>();        
        try {
            personagens = Arquivo.leitor("personagem");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!personagens.equals("")){
            String linhas[] = personagens.split("¢");
            for(int i=0; i<linhas.length; i++){
                String partes[] = linhas[i].split("§");                
                Personagem p = new Personagem(
                                                Integer.parseInt(partes[0]), 
                                                partes[1],
                                                partes[2],
                                                Integer.parseInt(partes[3]),
                                                Integer.parseInt(partes[4]),
                                                Integer.parseInt(partes[5]),
                                                Integer.parseInt(partes[6]),
                                                Integer.parseInt(partes[7]),
                                                Integer.parseInt(partes[8]));
                todos.add(p);                
            }
            return todos;
        }        
        return null;
    }
    
    public static Personagem getPorId(int id) {
        String personagens = "";
        
        try {
            personagens = Arquivo.leitor("personagem");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!personagens.equals("")){            
            String linhas[] = personagens.split("¢");
            for(int i=0; i<linhas.length; i++){
                String partes[] = linhas[i].split("§");
                if(Integer.parseInt(partes[0]) == id){
                    Personagem p = new Personagem(
                                                    Integer.parseInt(partes[0]), 
                                                    partes[1],
                                                    partes[2],
                                                    Integer.parseInt(partes[3]),
                                                    Integer.parseInt(partes[4]),
                                                    Integer.parseInt(partes[5]),
                                                    Integer.parseInt(partes[6]),
                                                    Integer.parseInt(partes[7]),
                                                    Integer.parseInt(partes[8]));
                    return p;
                }
            }
        }        
        return null;
    }
    
    public String getDados(){
        String retorno = "";
        retorno +=  nome+"§"+
                    tendencia+"§"+
                    forca+"§"+
                    destreza+"§"+
                    contituicao+"§"+
                    inteligencia+"§"+
                    sabedoria+"§"+
                    carisma;
        return retorno;
    }
}
