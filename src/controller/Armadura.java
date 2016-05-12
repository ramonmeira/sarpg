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
public class Armadura extends Item implements IObjeto{
    public static final String PASTA = "armadura";
    public int bonusDefesa;
    public int bonusMaxDestreza;
    public int penalidadeArmadura;
    public int falhaArcana;
    public int deslocamento;

    public Armadura() {
        this.bonusDefesa = 0;
        this.bonusMaxDestreza = 0;
        this.penalidadeArmadura = 0;
        this.falhaArcana = 0;
        this.deslocamento = 0;
    }

    public Armadura(String nome, double custo, double peso, String descricao, int bonusDefesa, int bonusMaxDestreza, int penalidadeArmadura, int falhaArcana, int deslocamento) {
        super(nome, custo, peso, descricao);
        this.bonusDefesa = bonusDefesa;
        this.bonusMaxDestreza = bonusMaxDestreza;
        this.penalidadeArmadura = penalidadeArmadura;
        this.falhaArcana = falhaArcana;
        this.deslocamento = deslocamento;
    }

    public int getBonusDefesa() {
        return bonusDefesa;
    }

    public void setBonusDefesa(int bonusDefesa) {
        this.bonusDefesa = bonusDefesa;
    }

    public int getBonusMaxDestreza() {
        return bonusMaxDestreza;
    }

    public void setBonusMaxDestreza(int bonusMaxDestreza) {
        this.bonusMaxDestreza = bonusMaxDestreza;
    }

    public int getPenalidadeArmadura() {
        return penalidadeArmadura;
    }

    public void setPenalidadeArmadura(int penalidadeArmadura) {
        this.penalidadeArmadura = penalidadeArmadura;
    }

    public int getFalhaArcana() {
        return falhaArcana;
    }

    public void setFalhaArcana(int falhaArcana) {
        this.falhaArcana = falhaArcana;
    }

    public int getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(int deslocamento) {
        this.deslocamento = deslocamento;
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
        retorno += this.getBonusDefesa()+"§";
        retorno += this.getBonusMaxDestreza()+"§";
        retorno += this.getPenalidadeArmadura()+"§";
        retorno += this.getFalhaArcana()+"§";
        retorno += this.getDeslocamento()+"§";
        retorno+="¢"; 
        return retorno;
    }
    
    public static ArrayList toObjeto(String as_armaduras){
        ArrayList armaduras = new ArrayList<>();
        
        if(as_armaduras.equals("")) return armaduras;
        
        String linhas[] = as_armaduras.split("¢");        
        for (String linha1 : linhas) {
            String[] linha = linha1.split("§");
            armaduras.add(new Armadura(linha[0], Double.parseDouble(linha[1]), Double.parseDouble(linha[2]), linha[3], Integer.parseInt(linha[4]), Integer.parseInt(linha[5]), Integer.parseInt(linha[6]), Integer.parseInt(linha[7]), Integer.parseInt(linha[8])));
        }
        return armaduras;
    }    
}
