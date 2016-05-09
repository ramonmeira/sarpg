/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Ramon
 */
public class Item {
    public String nome;
    public double custo;
    public double peso;
    public String descricao;

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
        
}
