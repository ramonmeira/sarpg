/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ramon
 */
public class Campanha extends Objeto{
    private ArrayList<Personagem> personagem; 
    private ArrayList<Integer> nivel;
    private String descrição;
    private String observações;

    public Campanha(ArrayList<Personagem> personagem, ArrayList<Integer> nivel, String descrição,String observações){
        this.personagem = personagem;
        this.nivel = nivel;
        this.descrição = descrição;
        this.observações = observações;
    }    

    private Campanha() {
        
    }
    
    public ArrayList<Personagem> getPersonagem() {
        return personagem;
    }

    public void setPersonagem(ArrayList<Personagem> personagem) {
        this.personagem = personagem;
    }

    public ArrayList<Integer> getNivel() {
        return nivel;
    }

    public void setNivel(ArrayList<Integer> nivel) {
        this.nivel = nivel;
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
        
    public static ArrayList<Campanha> carregar(){
        String campanhas = "";
        ArrayList<Campanha> camp = new ArrayList<>();
        ArrayList<Personagem> pers;
        ArrayList<Integer> niv;
        Campanha c;
        Personagem p;
        
        try {
            campanhas = Arquivo.leitor("campanha");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(campanhas.equals("")) return null;
        
        String linhas[] = campanhas.split("¢");        
        for(int i=0; i< linhas.length;i++){
            String linha[] = linhas[i].split("§");
            String partes[] = linha[0].split("_");
            String id[] = partes[0].split("-");
            pers = new ArrayList<>();
            for(int j=0; j<id.length; j++){
                p = Personagem.getPorId(Integer.parseInt(id[j]));
                pers.add(p);
            }
            String niveis[] = partes[1].split("-");
            niv = new ArrayList<>();
            for(int j=0; j<niveis.length; j++){
                niv.add(Integer.parseInt(niveis[j]));
            }
            c = new Campanha(pers,niv,linha[1],linha[2]);            
            camp.add(c);
        }
        return camp;
    }
    
    public static void salvar(ArrayList<Campanha> c){
        String retorno = "";
        if(c.isEmpty()) return;
        for (Campanha c1 : c) {
            for (int i=0; c1.getPersonagem() != null && i < c1.getPersonagem().size(); i++) {
                retorno += c1.getPersonagem().get(i).getId();
                if(i+1!=c1.getPersonagem().size()) retorno += "-";
            }
            retorno += "_";
            for (int i=0; c1.getNivel() != null && i< c1.getNivel().size(); i++) {
                retorno += c1.getNivel().get(i);
                if(i+1!=c1.getNivel().size()) retorno += "-";
            }
            retorno += "§";        
            retorno += c1.getDescrição()+"§"+c1.getObservacao()+"¢"; 
        }
        try {
            Arquivo.escritor(retorno, "campanha");
        } catch (IOException ex) {
            Logger.getLogger(Campanha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
