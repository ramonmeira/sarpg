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
public class Config {
    public static void inicializarArquivo(){
        try {
            Arquivo.escritor("1_1_10_1-2-3&2_1_10_3-4&3_1_10_0&4_1_10_0§Campanha com quatro personagens nível 1§akddkjasdh¢1_2_12_1-3&2_2_12_3-4&3_2_12_0&4_2_12_0§Campanha 2§akddkjasdh¢1_10_10_1-2-3&2_10_-4_3-4&3_10_5_0&4_1__1§Campanha avançada§akddkjasdh¢1_1_10_1-2-3§Campanha com um personagem§akddkjasdh¢1_1__1-2-3&2_1__3-4&3_1__0§Campanha com 3§akddkjasdh¢", "campanha");
            Arquivo.escritor("Aramil§NEUTRO_BOM§18§20§10§10§18§10¢Thokk Ofir§NEUTRO§20§18§10§16§8§8¢Felipe§CAOTICO_BOM§18§18§10§14§14§10¢Theodore Miranda Flores§NEUTRO_BOM§10§20§10§18§10§18¢","personagem");
            Arquivo.escritor("Bardo§d8§NEUTRO,CAOTICO_BOM§15¢Guerreiro§d10§NEUTRO,NEUTRO_BOM§5¢Ladino§d6§CAOTICO_NEUTRO,NEUTRO§30¢","classe");
            Arquivo.escritor("Latander§10§LUZ,CURA¢Torm§17§GUERRA,ORDEM¢BANER§16§MAL,MORTE,GUERRA¢","divindade");
            Arquivo.escritor("Nome§escola§1§componentes§tempoDeExecução§alcance§efeito§duração§TRUE§FALSE¢","magia");
            Arquivo.escritor("Nome§descrição§1.0§1.1§1§1§ ¢","equipamento");
        } catch (IOException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void inicializaSistema(){
        Sistema.getInstance().setEquipamentos(Equipamento.carregar());
        Sistema.getInstance().setDivindades(Divindade.carregar());
        Sistema.getInstance().setClasse(Classe.carregar());
        Sistema.getInstance().setMagia(Magia.carregar());
        Sistema.getInstance().setPersonagem(Personagem.carregar());        
        Sistema.getInstance().setCampanha(Campanha.carregar());
    }

    public static void teste() {
        
        ArrayList<Magia> p = Magia.carregar();
        System.out.println("view.jfTelaPrincipal.jMTestesActionPerformed()"+p.get(0).toString()+"  "+p.size());
        p.add(p.get(0));
        Magia.salvar(p);
    }
}
