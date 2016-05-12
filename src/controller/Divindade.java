/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author Ramon
 */

public class Divindade implements IObjeto{
    private String nome;
    private int poder;
    private ArrayList<EnumDominios> dominios;
    public static final String PASTA = "divindade";

    public Divindade(String nome, int poder, ArrayList<EnumDominios> dominios) {
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

    public ArrayList<EnumDominios> getDominios() {
        return dominios;
    }

    public void setDominios(ArrayList<EnumDominios> dominios) {
        this.dominios = dominios;
    }
    
    @Override
    public String getPasta() {
        return PASTA;
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno += this.getNome()+"§"+this.getPoder()+"§";
            for(EnumDominios dom: this.getDominios()){
                retorno += dom;
                if(dom!=this.getDominios().get(this.getDominios().size()-1))retorno +=",";
            }
            retorno+="¢"; 
        return retorno;
    }
    
    public static ArrayList<Divindade> toObjeto(String ls_divindade){
        ArrayList<EnumDominios> dominios;
        ArrayList<Divindade> lA_divindade = new ArrayList<>();
        
        String linhas[] = ls_divindade.split("¢");        
        for (String linha1 : linhas) {
            String[] linha = linha1.split("§");
            String dom[] = linha[2].split(",");
            dominios = new ArrayList<>();
            for (String dom1 : dom) {
                dominios.add(EnumDominios.toDominios(dom1));
            }
            lA_divindade.add(new Divindade(linha[0], Integer.parseInt(linha[1]), dominios));
        }
        return lA_divindade;
    }
            
}
