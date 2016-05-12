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
public enum EnumTamanho {
    MIUDO("Miúdo"), PEQUENO("Pequeno"), MEDIO("Médio"), GRANDE("Grande"), GIGANTE("Gigante"), COLOSSAL("Colossal");
    
    private final String valor;
	EnumTamanho(String v) {
		valor = v;
	}
    
    public static EnumTamanho toTamanho(String s){
        for(EnumTamanho d: EnumTamanho.values())
            if(d.name().equals(s)) return d;
        return null;
    }
}
