/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ramon
 */
public class Raca implements IObjeto{
    public static final String PASTA = "raca";
    private String nome;
    private String tamanho;
    private int delocamento;
    private ArrayList<String> idiomas;

    public Raca(String nome, String tamanho, int delocamento, ArrayList<String> idiomas) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.delocamento = delocamento;
        this.idiomas = idiomas;
    }

    public Raca() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getDelocamento() {
        return delocamento;
    }

    public void setDelocamento(int delocamento) {
        this.delocamento = delocamento;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }
    
    public String getPasta() {
        return PASTA;
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno += this.getNome()+"§";
        retorno += this.getTamanho()+"§";
        retorno += this.getDelocamento()+"§";
        for(String s: getIdiomas()){
            retorno += s+",";
        }
        retorno+="¢"; 
        return retorno;
    }
    
    public static ArrayList toObjeto(String as_raca){
        ArrayList raca = new ArrayList<>();        
        
        if(as_raca.equals("")) return raca;
        
        String linhas[] = as_raca.split("¢");        
        for (String linha1 : linhas) {
            String[] linha = linha1.split("§");
            String[] id = linha[3].split(",");
            ArrayList idiomas = new ArrayList<>();
            idiomas.addAll(Arrays.asList(id));
            raca.add(new Raca(linha[0], linha[1], Integer.parseInt(linha[2]), idiomas));
        }
        return raca;
    }
    
}
