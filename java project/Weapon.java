/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clashoftext;

import java.awt.Color;

/**
 *
 * @author Gebruiker
 */
public class Weapon {
    
    private Color Color;
    private int Dexterity;
    private int Damage;
    private String TypeofWeapons;
    private String Tier;
    public String Name; //changed private to public to make this var accessible for equip();
    private int Hand;
    
    public Weapon(String Name, int Damage, int Hand){
        
        this.Name = Name;
        this.Damage = Damage;
        this.Hand = Hand;
        
        
    }
    
    public void attack(Char other){
        System.out.println(Name + " deals " + Damage + " damage, ");
        other.receiveDamage(Damage);
    }
}
