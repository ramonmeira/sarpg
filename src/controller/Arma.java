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
public class Arma {
    public String dano;
    public String tipo;
    public String decisivo;
    public int incrementoDeDistancia;

    public Arma() {
        this.dano = "";
        this.tipo = "";
        this.decisivo = "";
        this.incrementoDeDistancia = 0;
    }

    public Arma(String dano, String tipo, String decisivo, int incrementoDeDistancia) {
        this.dano = dano;
        this.tipo = tipo;
        this.decisivo = decisivo;
        this.incrementoDeDistancia = incrementoDeDistancia;
    }
    
    
}
