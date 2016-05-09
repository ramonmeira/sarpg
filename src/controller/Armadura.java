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
public class Armadura {
    public int bonusDefesa;
    public int bonusMaxDestreza;
    public int penalidadeArmadura;
    public int falhaArcana;
    public int deslocamento;

    public Armadura() {
        this.bonusDefesa = 0;
        this.bonusMaxDestreza = 0;
        this.penalidadeArmadura = 0;
        this.falhaArcana = 0;
        this.deslocamento = 0;
    }

    public Armadura(int bonusDefesa, int bonusMaxDestreza, int penalidadeArmadura, int falhaArcana, int deslocamento) {
        this.bonusDefesa = bonusDefesa;
        this.bonusMaxDestreza = bonusMaxDestreza;
        this.penalidadeArmadura = penalidadeArmadura;
        this.falhaArcana = falhaArcana;
        this.deslocamento = deslocamento;
    }
    
    
}
