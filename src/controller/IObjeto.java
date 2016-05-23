package controller;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramon
 */
public interface IObjeto {
    
    public String getPasta();
        
    @Override
    public String toString();

//    nao permitido em java 1.7
//    public static ArrayList<IObjeto> toObjeto(String s){
//        return null;
//    }

}
