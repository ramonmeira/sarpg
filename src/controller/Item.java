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
public class Item implements IObjeto{    
    private static final String PASTA = "item";
    private String nome;
    private double custo;
    private double peso;
    private String descricao;

    public Item() {
        this.nome = "";
        this.custo = 0.0;
        this.peso = 0.0;
        this.descricao = "";
    }

    public Item(String nome, double custo, double peso, String descricao) {
        this.nome = nome;
        this.custo = custo;
        this.peso = peso;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
        
    public String getPasta() {
        return PASTA;
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno += this.getNome()+"§";
        retorno += this.getCusto()+"§";
        retorno += this.getPeso()+"§";
        retorno += this.getDescricao()+"§";
        retorno+="¢"; 
        return retorno;
    }
    
    public static ArrayList toObjeto(String as_armas){
        ArrayList armas = new ArrayList<>();
        
        String linhas[] = as_armas.split("¢");        
        for (String linha1 : linhas) {
            String[] linha = linha1.split("§");
            armas.add(new Item(linha[0], Double.parseDouble(linha[1]), Double.parseDouble(linha[2]), linha[3]));
        }
        return armas;
    }
        
}
