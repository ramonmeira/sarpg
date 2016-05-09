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
public enum Dominios {
    AGUA,FOGO,TERRA,AR,CURA,GUERRA,MORTE,VIAJEM,NATUREZA,CAOS,ORDEM,BEM,MAL,LUZ,TREVAS;
    
    public static Dominios toDominios(String dom){
        for(Dominios d: Dominios.values())
            if(d.name().equals(dom)) return d;
        return null;
    }
}
