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
            Arquivo.escrever(Sistema.EnumObjeto.ARMA.getValor(),"");
            Arquivo.escrever(Sistema.EnumObjeto.ARMADURA.getValor(),"");
            Arquivo.escrever(Sistema.EnumObjeto.CAMPANHA.getValor(),"1_1_10_1-2-3&2_1_10_3-4&3_1_10_0&4_1_10_0§Campanha com quatro personagens nível 1§akddkjasdh¢1_2_12_1-3&2_2_12_3-4&3_2_12_0&4_2_12_0§Campanha 2§akddkjasdh¢1_10_10_1-2-3&2_10_-4_3-4&3_10_5_0&4_1__1§Campanha avançada§akddkjasdh¢1_1_10_1-2-3§Campanha com um personagem§akddkjasdh¢1_1__1-2-3&2_1__3-4&3_1__0§Campanha com 3§akddkjasdh¢");
            Arquivo.escrever(Sistema.EnumObjeto.CLASSE.getValor(),"Bardo§d8§NEUTRO,CAOTICO_BOM§15¢Guerreiro§d10§NEUTRO,NEUTRO_BOM§5¢Ladino§d6§CAOTICO_NEUTRO,NEUTRO§30¢");
            Arquivo.escrever(Sistema.EnumObjeto.DIVINDADE.getValor(),"Latander§10§LUZ,CURA¢Torm§17§GUERRA,ORDEM¢BANER§16§MAL,MORTE,GUERRA¢");            
            Arquivo.escrever(Sistema.EnumObjeto.EQUIPAMENTO.getValor(),"Nome§descrição§1.0§1.1§1§1§ ¢");            
            Arquivo.escrever(Sistema.EnumObjeto.MAGIA.getValor(),"Nome§escola§1§componentes§tempoDeExecução§alcance§efeito§duração§TRUE§FALSE¢");
            Arquivo.escrever(Sistema.EnumObjeto.PERICIA.getValor(),"");
            Arquivo.escrever(Sistema.EnumObjeto.PERSONAGEM.getValor(),"Aramil§NEUTRO_BOM§18§20§10§10§18§10¢Thokk Ofir§NEUTRO§20§18§10§16§8§8¢Felipe§CAOTICO_BOM§18§18§10§14§14§10¢Theodore Miranda Flores§NEUTRO_BOM§10§20§10§18§10§18¢");
            Arquivo.escrever(Sistema.EnumObjeto.RACA.getValor(),"");
            Arquivo.escrever(Sistema.EnumObjeto.TALENTO.getValor(),"");
            
        } catch (IOException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void inicializaSistema(){
        Sistema.getInstance().setArma(Sistema.EnumObjeto.ARMA.fromSistema());
        Sistema.getInstance().setArmadura(Sistema.EnumObjeto.ARMADURA.fromSistema());
        Sistema.getInstance().setCampanha(Sistema.EnumObjeto.CAMPANHA.fromSistema());
        Sistema.getInstance().setClasse(Sistema.EnumObjeto.CLASSE.fromSistema());        
        Sistema.getInstance().setDivindades(Sistema.EnumObjeto.DIVINDADE.fromSistema());
        Sistema.getInstance().setEquipamentos(Sistema.EnumObjeto.EQUIPAMENTO.fromSistema());
        Sistema.getInstance().setMagia(Sistema.EnumObjeto.MAGIA.fromSistema());
        Sistema.getInstance().setPericia(Sistema.EnumObjeto.PERICIA.fromSistema());
        Sistema.getInstance().setPersonagem(Sistema.EnumObjeto.PERSONAGEM.fromSistema());        
        Sistema.getInstance().setRaca(Sistema.EnumObjeto.RACA.fromSistema());
        Sistema.getInstance().setTalento(Sistema.EnumObjeto.TALENTO.fromSistema());
    }

    public static void teste() {
        
    }
}
