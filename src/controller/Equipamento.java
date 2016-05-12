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
class Equipamento extends Item implements IObjeto{
    public static final String PASTA = "equipamento";
    public int bonus;
    public String tipoBonus;
    public int Quantidade;

    public Equipamento(String nome, double custo, double peso, String descricao, int bônus, String tipoBonus, int Quantidade) {
        super(nome, custo, peso, descricao);
        this.bonus = bônus;
        this.tipoBonus = tipoBonus;
        this.Quantidade = Quantidade;
    }

    public Equipamento() {
        super();
        this.bonus = 0;
        this.tipoBonus = "";
        this.Quantidade = 0;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getTipoBonus() {
        return tipoBonus;
    }

    public void setTipoBonus(String tipoBonus) {
        this.tipoBonus = tipoBonus;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
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
        retorno += this.getBonus()+"§";
        retorno += this.getTipoBonus()+"§";        
        retorno += this.getQuantidade()+"¢";
        return retorno;
    }    
    
    public static ArrayList toObjeto(String as_equipamentos){
        ArrayList equipamentos = new ArrayList<>();
        
        if(as_equipamentos.equals("")) return equipamentos;
        
        String linhas[] = as_equipamentos.split("¢");        
        for (String linha1 : linhas) {
            String[] linha = linha1.split("§");
            equipamentos.add(new Equipamento(linha[0], Double.parseDouble(linha[1]), Double.parseDouble(linha[2]), linha[3], Integer.parseInt(linha[4]), linha[5], Integer.parseInt(linha[6])));
        }
        return equipamentos;
    }
    
}
