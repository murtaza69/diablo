/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clashoftext;

/**
 *
 * @author Gebruiker
 */
public class Char {
    private Weapon Damage;
    private String Name;
    private int Level;
    private int Hitpoints;
    private int HitpointMax;

    public Char(String Name, int Level, int Hitpoints){
        this.Name = Name;
        this.Hitpoints = Hitpoints;
        this.HitpointMax = Hitpoints;
        this.Level = Level;
    }
    public void introduce(){
        System.out.println("My name is " + Name + ". I am Level " + Level);
    }
    public void equip(Weapon weapon){
        System.out.println(Name + " equipped: " + weapon.Name);
    }
    public void attack(Char other){
       System.out.println("");
       System.out.println(Name + " attacks " + other.Name + "!");
       
    }
    public void receiveDamage(int amount){
        Hitpoints = Hitpoints - amount;
        System.out.println(Name + " his hitpoints is reduced by " + amount + " to " + Hitpoints);
        isDead();
    }
    public boolean isDead(){
        if(Hitpoints <= 0){
            System.out.println(Name + " died.");
        }
        return false;
    }
    public void heal(){
        HitpointMax = Hitpoints;
    }
}