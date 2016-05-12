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
public class Talento implements IObjeto{
    public static final String PASTA = "arma";
    private String nome;
    private String descricao;
    private String pre_requisito;
    private String beneficio;
    private String especial;

    public Talento(String nome, String descricao, String pre_requisito, String beneficio, String especial) {
        this.nome = nome;
        this.descricao = descricao;
        this.pre_requisito = pre_requisito;
        this.beneficio = beneficio;
        this.especial = especial;
    }

    public Talento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPre_requisito() {
        return pre_requisito;
    }

    public void setPre_requisito(String pre_requisito) {
        this.pre_requisito = pre_requisito;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }
    
    public String getPasta() {
        return PASTA;
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno += this.getNome()+"§";
        retorno += this.getDescricao()+"§";
        retorno += this.getPre_requisito()+"§";
        retorno += this.getBeneficio()+"§";
        retorno += this.getEspecial()+"§";
        retorno+="¢"; 
        return retorno;
    }
    
    public static ArrayList toObjeto(String as_talento){
        ArrayList talentos = new ArrayList<>();
        
        if(as_talento.equals("")) return talentos;
        
        String linhas[] = as_talento.split("¢");        
        for (String linha1 : linhas) {
            String[] linha = linha1.split("§");
            talentos.add(new Talento(linha[0], linha[1], linha[2], linha[3], linha[4]));
        }
        return talentos;
    }
}
