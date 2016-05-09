/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Arquivo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramon
 */
public class Classe{
    private String nome;
    private String dadoDeVida;
    private ArrayList<TipoTendencias> tendência;
    private int pontosDePericias;

    public Classe(String nome, String dadoDeVida, ArrayList<TipoTendencias> tendência, int pontosDePericias) {
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

    public ArrayList<TipoTendencias> getTendência() {
        return tendência;
    }

    public void setTendência(ArrayList<TipoTendencias> tendência) {
        this.tendência = tendência;
    }

    public int getPontosDePericias() {
        return pontosDePericias;
    }

    public void setPontosDePericias(int pontosDePericias) {
        this.pontosDePericias = pontosDePericias;
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
    
    public static ArrayList<Classe> carregar(){
        String ls_classe = "";
        ArrayList<Classe> lCl_classe = new ArrayList<>();
        ArrayList<TipoTendencias> tt;
        try {
            ls_classe = Arquivo.leitor("classe");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(ls_classe.equals("")) return null;
        String linhas[] = ls_classe.split("¢");        
        for(int i=0; i< linhas.length;i++){
            String atributos[] = linhas[i].split("§");   
            String dom[] = atributos[2].split(",");
            tt = new ArrayList<>();
            for(int j=0; j<dom.length; j++)
                tt.add(TipoTendencias.toTipo(dom[j]));
            lCl_classe.add(new Classe(atributos[0], atributos[1], tt, Integer.parseInt(atributos[3])));
        }
        return lCl_classe;
    }
    
    public static void salvar(ArrayList<Classe> c){
        String retorno = "";
        if(c.isEmpty()) return;
        for (Classe c1 : c) {      
            retorno += c1.toString();
        }
        try {
            Arquivo.escritor(retorno, "classe");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
