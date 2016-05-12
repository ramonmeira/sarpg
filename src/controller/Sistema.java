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
public class Sistema {
    private static Sistema sis;
    private static ArrayList<Arma> arma;
    private static ArrayList<Armadura> armadura;
    private static ArrayList<Campanha> campanha;
    private static ArrayList<Classe> classe;
    private static ArrayList<Divindade> divindades;
    private static ArrayList<Equipamento> equipamentos;
    private static ArrayList<Magia> magia;
    private static ArrayList<Pericia> pericia;
    private static ArrayList<Personagem> personagem;
    private static ArrayList<Raca> raca;
    private static ArrayList<Talento> talento;

    public enum EnumObjeto{
        ARMA(Arma.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Arma.toObjeto(s);
                
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getArma();
            }
        },
        ARMADURA(Armadura.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Armadura.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getArmadura();
            }
        },
        CAMPANHA(Campanha.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Campanha.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getCampanha();
            }
        },
        CLASSE(Classe.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Classe.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getClasse();
            }
        },
        DIVINDADE(Divindade.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Divindade.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getDivindades();
            }
        },
        EQUIPAMENTO(Equipamento.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Equipamento.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getEquipamentos();
            }
        },
        MAGIA(Magia.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Magia.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getMagia();
            }
        }, 
        PERICIA(Pericia.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Pericia.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getPericia();
            }
        },
        PERSONAGEM(Personagem.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Personagem.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getPersonagem();
            }
        }, 
        RACA(Raca.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Raca.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getRaca();
            }
        }, 
        TALENTO(Talento.PASTA){
            @Override
            public ArrayList toObjeto(String s) {
                return Talento.toObjeto(s);
            }

            @Override
            public ArrayList fromSistema() {
                return Sistema.getInstance().getTalento();
            }
        }; // note the semi-colon after the final constant, not just a comma!
        public abstract ArrayList toObjeto(String s);
        public abstract ArrayList fromSistema();
        
        private final String valor;
	EnumObjeto(String v) {
		valor = v;
	}
        
        public String getValor(){
		return valor;
	}
    }
    
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

    public ArrayList getArma() {
        return arma;
    }

    public void setArma(ArrayList arma) {
        Sistema.arma = arma;
    }

    public ArrayList getArmadura() {
        return armadura;
    }

    public void setArmadura(ArrayList armadura) {
        Sistema.armadura = armadura;
    }

    public ArrayList getCampanha() {
        return campanha;
    }

    public void setCampanha(ArrayList campanha) {
        Sistema.campanha = campanha;
    }

    public ArrayList getClasse() {
        return classe;
    }

    public void setClasse(ArrayList classe) {
        Sistema.classe = classe;
    }

    public ArrayList getDivindades() {
        return divindades;
    }

    public void setDivindades(ArrayList divindades) {
        Sistema.divindades = divindades;
    }

    public ArrayList getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList equipamentos) {
        Sistema.equipamentos = equipamentos;
    }

    public ArrayList getMagia() {
        return magia;
    }

    public void setMagia(ArrayList magia) {
        Sistema.magia = magia;
    }

    public ArrayList getPericia() {
        return pericia;
    }

    public void setPericia(ArrayList pericia) {
        Sistema.pericia = pericia;
    }

    public ArrayList getPersonagem() {
        return personagem;
    }

    public void setPersonagem(ArrayList personagem) {
        Sistema.personagem = personagem;
    }

    public ArrayList getRaca() {
        return raca;
    }

    public void setRaca(ArrayList raca) {
        Sistema.raca = raca;
    }

    public ArrayList getTalento() {
        return talento;
    }

    public void setTalento(ArrayList talento) {
        Sistema.talento = talento;
    }    
        
    public static void inicializaSistema(){   
        Sistema.getInstance().setArma(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.ARMA));
        Sistema.getInstance().setArmadura(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.ARMADURA));
        Sistema.getInstance().setClasse(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.CLASSE));        
        Sistema.getInstance().setDivindades(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.DIVINDADE));        
        Sistema.getInstance().setEquipamentos(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.EQUIPAMENTO));
        Sistema.getInstance().setMagia(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.MAGIA));
        Sistema.getInstance().setPericia(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.PERICIA));           
        Sistema.getInstance().setRaca(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.RACA));
        Sistema.getInstance().setTalento(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.TALENTO));
        
        Sistema.getInstance().setPersonagem(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.PERSONAGEM));     
        Sistema.getInstance().setCampanha(Arquivo.carregarDoArquivo(Sistema.EnumObjeto.CAMPANHA));
        
    }
    
    public static void salvar(EnumObjeto o) {
        Arquivo.atualizar(o.fromSistema());
    }
    
    public static void salvarTudo() {
        for(EnumObjeto o: EnumObjeto.values())
            salvar(o);
    }
    
    /**
     * Cria novos arquivos, mas apaga qualquer informação que já existia e atualiza as listas
     */
    public static void inicializarArquivo(){
        try {
            Arquivo.escreverCasoNaoTenha("",Sistema.EnumObjeto.ARMA.getValor());
            Arquivo.escreverCasoNaoTenha("",Sistema.EnumObjeto.ARMADURA.getValor());
            Arquivo.escreverCasoNaoTenha("0_1_10_1-2-3&1_1_10_3-4&2_1_10_0&3_1_10_0§Campanha com quatro personagens nível 1§akddkjasdh¢0_2_12_1-3&1_2_12_3-4&2_2_12_0&3_2_12_0§Campanha 2§akddkjasdh¢0_10_10_1-2-3&1_10_-4_3-4&2_10_5_0&3_1__1§Campanha avançada§akddkjasdh¢0_1_10_1-2-3§Campanha com um personagem§akddkjasdh¢0_1__1-2-3&1_1__3-4&2_1__0§Campanha com 3§akddkjasdh¢", Sistema.EnumObjeto.CAMPANHA.getValor());
            Arquivo.escreverCasoNaoTenha("Bardo§d8§NEUTRO,CAOTICO_BOM§15¢Guerreiro§d10§NEUTRO,NEUTRO_BOM§5¢Ladino§d6§CAOTICO_NEUTRO,NEUTRO§30¢",Sistema.EnumObjeto.CLASSE.getValor());
            Arquivo.escreverCasoNaoTenha("Latander§10§LUZ,CURA¢Torm§17§GUERRA,ORDEM¢BANER§16§MAL,MORTE,GUERRA¢",Sistema.EnumObjeto.DIVINDADE.getValor());
            Arquivo.escreverCasoNaoTenha("Poção: força do touro§1.0§1.1§descrição§4§força§1¢Corda§1.0§1.1§descrição§0§escalar§1¢Poção: agilidade do gato§1.0§1.1§descrição§4§destreza§1¢Luneta§1.0§1.1§descrição§2§observar§1¢Mochila§1.0§1.1§descrição§0§carga§1¢",Sistema.EnumObjeto.EQUIPAMENTO.getValor());
            Arquivo.escreverCasoNaoTenha("Nome§escola§1§componentes§tempoDeExecução§alcance§efeito§duração§TRUE§FALSE¢",Sistema.EnumObjeto.MAGIA.getValor());
            Arquivo.escreverCasoNaoTenha("",Sistema.EnumObjeto.PERICIA.getValor());
            Arquivo.escreverCasoNaoTenha("Aramil§NEUTRO_BOM§18§20§10§10§18§10¢Thokk Ofir§NEUTRO§20§18§10§16§8§8¢Felipe§CAOTICO_BOM§18§18§10§14§14§10¢Theodore Miranda Flores§NEUTRO_BOM§10§20§10§18§10§18¢",Sistema.EnumObjeto.PERSONAGEM.getValor());
            Arquivo.escreverCasoNaoTenha("",Sistema.EnumObjeto.RACA.getValor());
            Arquivo.escreverCasoNaoTenha("",Sistema.EnumObjeto.TALENTO.getValor());
            
            Sistema.inicializaSistema();
            
        } catch (IOException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void teste() {
        for(EnumObjeto o: EnumObjeto.values())
            System.out.println("controller.Sistema.teste()"+o.getValor());
    }
    
}
