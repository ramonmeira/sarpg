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
public class Classe implements IObjeto{
    public static final String PASTA = "classe";
    private String nome;
    private String dadoDeVida;
    private ArrayList<EnumTendencias> tendência;
    private int pontosDePericias;

    public Classe(String nome, String dadoDeVida, ArrayList<EnumTendencias> tendência, int pontosDePericias) {
        this.nome = nome;
        this.dadoDeVida = dadoDeVida;
        this.tendência = tendência;
        this.pontosDePericias = pontosDePericias;
    }

    public Classe() {
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDadoDeVida() {
        return dadoDeVida;
    }

    public void setDadoDeVida(String dadoDeVida) {
        this.dadoDeVida = dadoDeVida;
    }

    public ArrayList<EnumTendencias> getTendência() {
        return tendência;
    }

    public void setTendência(ArrayList<EnumTendencias> tendência) {
        this.tendência = tendência;
    }

    public int getPontosDePericias() {
        return pontosDePericias;
    }

    public void setPontosDePericias(int pontosDePericias) {
        this.pontosDePericias = pontosDePericias;
    }
    
    public String getPasta() {
        return PASTA;
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno += this.getNome()+"§";
            for(int i=0; i<this.getTendência().size(); i++){
                retorno+= this.getTendência().get(i).name();
                if(i!=this.getTendência().size()-1) retorno += ",";
            }
            retorno +="§"+this.getDadoDeVida()+"§"+this.getPontosDePericias()+"¢";
        return retorno;
    }
    
    public static ArrayList<Classe> toObjeto(String ls_classe){
        ArrayList<Classe> lCl_classe = new ArrayList<>();
        ArrayList<EnumTendencias> tt;
        if(ls_classe.equals("")) return null;
        String linhas[] = ls_classe.split("¢");        
        for (String linha : linhas) {
            String[] atributos = linha.split("§");   
            String dom[] = atributos[2].split(",");
            tt = new ArrayList<>();
            for (String dom1 : dom) {
                tt.add(EnumTendencias.toTipo(dom1));
            }
            lCl_classe.add(new Classe(atributos[0], atributos[1], tt, Integer.parseInt(atributos[3])));
        }
        return lCl_classe;
    }
    
}
