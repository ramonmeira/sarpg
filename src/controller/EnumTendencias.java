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
public  enum EnumTendencias {
    LEAL_BOM,LEAL_NEUTRO,LEAL_MAL,NEUTRO_BOM,NEUTRO,NEUTRO_MAL,CAOTICO_BOM,CAOTICO_NEUTRO,CAOTICO_MAL;
    
    public static EnumTendencias toTipo(String t){
        for(EnumTendencias tt: EnumTendencias.values()){
            if(tt.name().equals(t)) return tt;}
        return null;
    }
    
}

