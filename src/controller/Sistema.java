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
public class Sistema {
    private static Sistema sis;
    private static ArrayList<Campanha> campanha;
    private static ArrayList<Classe> classe;
    private static ArrayList<Magia> magia;
    private static ArrayList<Personagem> personagem;
    private static ArrayList<Divindade> divindades;
    private static ArrayList<Equipamento> equipamentos;
    private Sistema(){
        
    }
    public static Sistema getInstance(){
            if(sis == null){
                    inicializar();
            }
            return sis;
    }

    private static synchronized void inicializar(){
        if(sis == null){
            sis = new Sistema();
        }
    }
    
    public ArrayList<Campanha> getCampanha() {
        return campanha;
    }

    public void setCampanha(ArrayList<Campanha> campanha) {
        Sistema.campanha = campanha;
    }

    public ArrayList<Classe> getClasse() {
        return classe;
    }

    public void setClasse(ArrayList<Classe> classe) {
        Sistema.classe = classe;
    }

    public ArrayList<Magia> getMagia() {
        return magia;
    }

    public void setMagia(ArrayList<Magia> magia) {
        Sistema.magia = magia;
    }

    public ArrayList<Personagem> getPersonagem() {
        return personagem;
    }

    public void setPersonagem(ArrayList<Personagem> personagem) {
        Sistema.personagem = personagem;
    }

    public ArrayList<Divindade> getDivindades() {
        return divindades;
    }

    public void setDivindades(ArrayList<Divindade> divindades) {
        Sistema.divindades = divindades;
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
        Sistema.equipamentos = equipamentos;
    }
    
    
}
