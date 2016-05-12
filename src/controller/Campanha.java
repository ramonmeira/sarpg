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
public class Campanha implements IObjeto{
    public static final String PASTA = "campanha";
    private ArrayList<PersonagemNaCampanha> personagem;
    private String descrição;
    private String observações;

    public Campanha(ArrayList<PersonagemNaCampanha> personagem, String descrição,String observações){
        this.personagem = personagem;
        this.descrição = descrição;
        this.observações = observações;
    }    

    public Campanha() {
        this.personagem = new ArrayList<>();
        this.descrição = "";
        this.observações = "";        
    }
    
    public ArrayList<PersonagemNaCampanha> getPersonagem() {
        return personagem;
    }

    public void setPersonagem(ArrayList<PersonagemNaCampanha> personagem) {
        this.personagem = personagem;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescricao(String descrição) {
        this.descrição = descrição;
    }

    public String getObservacao() {
        return observações;
    }

    public void setObservações(String observações) {
        this.observações = observações;
    }
    
    public String getPasta() {
        return PASTA;
    }    
    
    @Override
    public String toString(){
        String retorno = "";
        
        for (int i=0; this.getPersonagem() != null && i < this.getPersonagem().size(); i++) {
            retorno += Sistema.getInstance().getPersonagem().indexOf(this.getPersonagem().get(i).getPersonagem())+"_";
            retorno += this.getPersonagem().get(i).getNivel()+"_";
            retorno += this.getPersonagem().get(i).getIniciativa()+"_";
            for (int j=0; this.getPersonagem().get(i).getEquipamento() != null && j < this.getPersonagem().get(i).getEquipamento().size(); j++) {
                retorno += Sistema.getInstance().getEquipamentos().indexOf(this.getPersonagem().get(i).getEquipamento().get(j));
                if(i+1!=this.getPersonagem().size()) retorno += "-";
            }
            retorno += "&";
        }
        retorno += "§"+this.getDescrição()+"§"+this.getObservacao()+"¢";
        System.out.println("controller.Campanha.toString()"+retorno);
        return retorno;
    }
               
    public static ArrayList<Campanha> toObjeto(String as_campanhas){        
        ArrayList<Campanha> camp = new ArrayList<>();
        ArrayList<PersonagemNaCampanha> personagensNaCampanha;
        ArrayList<Equipamento> equipamentos;
        Campanha c;
        
        if(as_campanhas.equals("")) return camp;
        
        String linhas[] = as_campanhas.split("¢");        
        for (String linha : linhas) {
            String[] campos = linha.split("§");            
            String personagens[] = campos[0].split("&");
            personagensNaCampanha = new ArrayList<>();            
            for(int k=0; k<personagens.length; k++){
                if(!personagens[k].equals("")){
                    String atributos[] = personagens[k].split("_");
                    String equips[] = atributos[3].split("-");
                    equipamentos = new ArrayList<Equipamento>();
                    for(int j=0; j<equips.length; j++){
                        if(Sistema.getInstance().getEquipamentos().size()>Integer.parseInt(equips[j]) && Integer.parseInt(equips[j])>0)
                            equipamentos.add((Equipamento)Sistema.getInstance().getEquipamentos().get(Integer.parseInt(equips[j])-1));
                        else
                            continue;
                    }
                    personagensNaCampanha.add(new PersonagemNaCampanha((Personagem)Sistema.getInstance().getPersonagem().get(Integer.parseInt(atributos[0])-1), Integer.parseInt(atributos[1].equals("")?"0":atributos[1]), Integer.parseInt(atributos[2].equals("")?"0":atributos[2]), equipamentos));
                }
            }
            c = new Campanha(personagensNaCampanha,campos[1],campos[2]);            
            camp.add(c);
        }
        return camp;
    }
    
}
