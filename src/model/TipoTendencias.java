/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ramon
 */
public  enum TipoTendencias {
    LEAL_BOM,LEAL_NEUTRO,LEAL_MAL,NEUTRO_BOM,NEUTRO,NEUTRO_MAL,CAOTICO_BOM,CAOTICO_NEUTRO,CAOTICO_MAL;
    
    public static TipoTendencias toTipo(String t){
        for(TipoTendencias tt: TipoTendencias.values()){
            System.out.println("model.TipoTendencias.toTipo()"+tt.name()+"  "+t);
            if(tt.name().equals(t)) return tt;}
        return null;
    }
    
}

