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
public class Magia implements IObjeto{
    public static final String PASTA = "magia";

    private String Nome;
    private String escola;
    private int nivel;
    private String componentes;
    private String tempoDeExecução;
    private String alcance;
    private String efeito;
    private String duração;
    private boolean testeDeResistência;
    private boolean resistenciaMagia;

    public Magia(String Nome, String escola, int nivel, String componentes, String tempoDeExecução, String alcance, String efeito, String duração, boolean testeDeResistência, boolean resistenciaMagia) {
        this.Nome = Nome;
        this.escola = escola;
        this.nivel = nivel;
        this.componentes = componentes;
        this.tempoDeExecução = tempoDeExecução;
        this.alcance = alcance;
        this.efeito = efeito;
        this.duração = duração;
        this.testeDeResistência = testeDeResistência;
        this.resistenciaMagia = resistenciaMagia;
    }

    public Magia() {
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public String getTempoDeExecução() {
        return tempoDeExecução;
    }

    public void setTempoDeExecução(String tempoDeExecução) {
        this.tempoDeExecução = tempoDeExecução;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    public boolean isTesteDeResistência() {
        return testeDeResistência;
    }

    public void setTesteDeResistência(boolean testeDeResistência) {
        this.testeDeResistência = testeDeResistência;
    }

    public boolean isResistenciaMagia() {
        return resistenciaMagia;
    }

    public void setResistenciaMagia(boolean resistenciaMagia) {
        this.resistenciaMagia = resistenciaMagia;
    }
    
    public String getPasta() {
        return PASTA;
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno +=  this.Nome+"§"+
                    this.escola+"§"+
                    this.nivel+"§"+
                    this.componentes+"§"+
                    this.tempoDeExecução+"§"+
                    this.alcance+"§"+
                    this.efeito+"§"+
                    this.duração+"§"+
                    this.testeDeResistência+"§"+
                    this.resistenciaMagia+"¢";
        return retorno;
    } 
    
    public static ArrayList<Magia> toObjeto(String as_magia){
        ArrayList<Magia> todos = new ArrayList<>();
        
        if(!as_magia.equals("")){
            String linhas[] = as_magia.split("¢");
            for(int i=0; i<linhas.length; i++){
                String partes[] = linhas[i].split("§");                
                Magia m = new Magia(
                                                partes[0],
                                                partes[1],                        
                                                Integer.parseInt(partes[2]),
                                                partes[3],
                                                partes[4],
                                                partes[5],
                                                partes[6],
                                                partes[7],                        
                                                Boolean.valueOf((partes[8])),
                                                Boolean.valueOf(partes[9]));
                todos.add(m);                
            }
            return todos;
        }        
        return null;
    }
    
}
