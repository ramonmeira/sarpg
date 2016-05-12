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
public class Arma extends Item implements IObjeto{
    private String dano;
    private String tipo;
    private String decisivo;
    private int incrementoDeDistancia;
    public static final String PASTA = "arma";

    public Arma() {
        super();
        this.dano = "";
        this.tipo = "";
        this.decisivo = "";
        this.incrementoDeDistancia = 0;
    }

    public Arma(String nome, double custo, double peso, String descricao, String dano, String tipo, String decisivo, int incrementoDeDistancia) {
        super(nome, custo, peso, descricao);
        this.dano = dano;
        this.tipo = tipo;
        this.decisivo = decisivo;
        this.incrementoDeDistancia = incrementoDeDistancia;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDecisivo() {
        return decisivo;
    }

    public void setDecisivo(String decisivo) {
        this.decisivo = decisivo;
    }

    public int getIncrementoDeDistancia() {
        return incrementoDeDistancia;
    }

    public void setIncrementoDeDistancia(int incrementoDeDistancia) {
        this.incrementoDeDistancia = incrementoDeDistancia;
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
        retorno += this.getDano()+"§";
        retorno += this.getTipo()+"§";
        retorno += this.getDecisivo()+"§";
        retorno += this.getIncrementoDeDistancia()+"§";
        retorno+="¢"; 
        return retorno;
    }
    
    public static ArrayList toObjeto(String as_armas){
        ArrayList armas = new ArrayList<>();
        
        if(as_armas.equals("")) return armas;
        
        String linhas[] = as_armas.split("¢");        
        for (String linha1 : linhas) {
            String[] linha = linha1.split("§");
            armas.add(new Arma(linha[0], Double.parseDouble(linha[1]), Double.parseDouble(linha[2]), linha[3], linha[4], linha[5], linha[6], Integer.parseInt(linha[7])));
        }
        return armas;
    }
    
}
