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
public class PersonagemNaCampanha {
    private Personagem personagem;
    private Integer nivel;
    private Integer iniciativa;
    private ArrayList<Equipamento> equipamento;

    public PersonagemNaCampanha() {
    }

    public PersonagemNaCampanha(Personagem personagem, Integer nivel, Integer iniciativa, ArrayList<Equipamento> equipamento) {
        this.personagem = personagem;
        this.nivel = nivel;
        this.iniciativa = iniciativa;
        this.equipamento = equipamento;
    }
    

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(Integer iniciativa) {
        this.iniciativa = iniciativa;
    }

    public ArrayList<Equipamento> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(ArrayList<Equipamento> equipamento) {
        this.equipamento = equipamento;
    }
    
    
}
