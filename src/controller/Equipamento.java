/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Arquivo;

/**
 *
 * @author Ramon
 */
class Equipamento extends Item{
    public int bonus;
    public String tipoBonus;
    public int Quantidade;

    public Equipamento(String nome, String descricao, double custo, double peso, int Quantidade, int bônus, String tipoBonus) {
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
    
    public String toString(){
        String retorno = "";
        retorno += this.getNome()+"§";
        retorno += this.getDescricao()+"§";
        retorno += this.getCusto()+"§";
        retorno += this.getPeso()+"§";
        retorno += this.getQuantidade()+"§";
        retorno += this.getBonus()+"§";
        retorno += this.getTipoBonus()+"¢";
        return retorno;
    }
    
    public static void salvar(ArrayList<Equipamento> e){
        String retorno = "";
        if(e.isEmpty()) return;
        for (Equipamento e1 : e) {      
            retorno += e1.toString();
        }
        try {
            Arquivo.escritor(retorno, "equipamento");
        } catch (IOException ex) {
            Logger.getLogger(Equipamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Equipamento> carregar(){
        String ls_ = "";
        ArrayList<Equipamento> equipamentos = new ArrayList<>();
        try {
            ls_ = Arquivo.leitor("equipamento");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(ls_.equals("")) return null;
        String linhas[] = ls_.split("¢");        
        for(int i=0; i< linhas.length;i++){            
            String partes[] = linhas[i].split("§");   
            equipamentos.add(new Equipamento(partes[0], partes[1], Double.parseDouble(partes[2]), Double.parseDouble(partes[3]), Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), partes[6]));
        }
        return equipamentos;
    }
    
}
