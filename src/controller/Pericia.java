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
public class Pericia implements IObjeto{
    public static final String PASTA = "pericia";
    private String nome;
    private String habilidadeChave;
    private boolean somenteTreinado;
    private int penalidadeDeArmadura;
    private String teste;
    private String acao;
    private String novasTentativas;
    private String especial;
    private String sinergia;
    private String restricoes;

    public Pericia(String nome, String habilidadeChave, boolean somenteTreinado, int penalidadeDeArmadura, String teste, String acao, String novasTentativas, String especial, String sinergia, String restricoes) {
        this.nome = nome;
        this.habilidadeChave = habilidadeChave;
        this.somenteTreinado = somenteTreinado;
        this.penalidadeDeArmadura = penalidadeDeArmadura;
        this.teste = teste;
        this.acao = acao;
        this.novasTentativas = novasTentativas;
        this.especial = especial;
        this.sinergia = sinergia;
        this.restricoes = restricoes;
    }

    public Pericia() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidadeChave() {
        return habilidadeChave;
    }

    public void setHabilidadeChave(String habilidadeChave) {
        this.habilidadeChave = habilidadeChave;
    }

    public boolean isSomenteTreinado() {
        return somenteTreinado;
    }

    public void setSomenteTreinado(boolean somenteTreinado) {
        this.somenteTreinado = somenteTreinado;
    }

    public int getPenalidadeDeArmadura() {
        return penalidadeDeArmadura;
    }

    public void setPenalidadeDeArmadura(int penalidadeDeArmadura) {
        this.penalidadeDeArmadura = penalidadeDeArmadura;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getNovasTentativas() {
        return novasTentativas;
    }

    public void setNovasTentativas(String novasTentativas) {
        this.novasTentativas = novasTentativas;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public String getSinergia() {
        return sinergia;
    }

    public void setSinergia(String sinergia) {
        this.sinergia = sinergia;
    }

    public String getRestricoes() {
        return restricoes;
    }

    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }
    
    public String getPasta() {
        return PASTA;
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno += this.getNome()+"§";
        retorno += this.getHabilidadeChave()+"§";
        retorno += this.isSomenteTreinado()+"§";
        retorno += this.getPenalidadeDeArmadura()+"§";
        retorno += this.getTeste()+"§";
        retorno += this.getAcao()+"§";
        retorno += this.getNovasTentativas()+"§";
        retorno += this.getEspecial()+"§";
        retorno += this.getEspecial()+"§";
        retorno += this.getRestricoes()+"§";
        retorno+="¢"; 
        return retorno;
    }
    
    public static ArrayList toObjeto(String as_pericia){
        ArrayList pericia = new ArrayList<>();
        
        if(as_pericia.equals("")) return pericia;
        
        String linhas[] = as_pericia.split("¢");        
        for (String linha1 : linhas) {
            String[] linha = linha1.split("§");
            pericia.add(new Pericia(linha[0] ,linha[1], Boolean.getBoolean(linha[2]), Integer.parseInt(linha[3]), linha[4],  linha[5], linha[6], linha[7], linha[8], linha[9]));
        }
        return pericia;
    }
    
}
