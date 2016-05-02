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

public class Divindade extends Objeto{
    private String nome;
    private int poder;
    private ArrayList<Dominios> dominios;

    public Divindade(String nome, int poder, ArrayList<Dominios> dominios) {
        this.nome = nome;
        this.poder = poder;
        this.dominios = dominios;
    }

    public Divindade() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public ArrayList<Dominios> getDominios() {
        return dominios;
    }

    public void setDominios(ArrayList<Dominios> dominios) {
        this.dominios = dominios;
    }
    
    public static ArrayList<Divindade> carregar(){
        String ls_divindade = "";
        ArrayList<Dominios> dominios;
        ArrayList<Divindade> lA_divindade = new ArrayList<>();
        
        try {
            ls_divindade = Arquivo.leitor("divindade");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(ls_divindade.equals("")) return null;
        
        String linhas[] = ls_divindade.split("¢");        
        for(int i=0; i< linhas.length;i++){
            String linha[] = linhas[i].split("§");
            String dom[] = linha[2].split(",");
            dominios = new ArrayList<>();
            for(int j=0; j<dom.length; j++)
                dominios.add(Dominios.toDominios(dom[j]));
            lA_divindade.add(new Divindade(linha[0], Integer.parseInt(linha[1]), dominios));
        }
        return lA_divindade;
    }
    
    public static void salvar(ArrayList<Divindade> d){
        String retorno = "";
        if(d.isEmpty()) return;
        for (Divindade d1 : d) {      
            retorno += d1.getNome()+"§"+d1.getPoder()+"§";
            for(Dominios dom: d1.getDominios()){
                retorno += dom;
                if(dom!=d1.getDominios().get(d1.getDominios().size()-1))retorno +=",";
            }
            retorno+="¢"; 
        }
        try {
            Arquivo.escritor(retorno, "divindade");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
            
}
