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
public enum EnumIdiomas {
    ELFICO("Élfico"), ANAO("Anão"), DRACONICO("Dracônico"), DRUIDICO("Druidico"), SILVESTRE("Silvestre"), CELESTIAL("Celestial"), INFERNAL("Infernal"), TERRAN("Terran"), IGNAN("Ignan"), AQUAN("Aquan");
    
    private final String valor;
	EnumIdiomas(String v) {
		valor = v;
	}
    
    public static EnumIdiomas toIdiomas(String s){
        for(EnumIdiomas d: EnumIdiomas.values())
            if(d.name().equals(s)) return d;
        return null;
    }
}
