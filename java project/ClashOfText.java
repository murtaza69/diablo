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
public class ClashOfText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Weapon axe =  new Axe("Dragon Battleaxe forged from divine powers");
        Weapon staff =  new Staff("Crystall Staff made by serenic cultists");
        Weapon shortbow =  new Shortbow("Heavy magic shortbow carved by elven snipers");
        Weapon longbow =  new Longbow("Cursed Goblin longbow owned by the mighty goblin demigod");
        Weapon greatsword =  new Greatsword("Drygore longsword");
        Weapon shortsword =  new Shortsword("Toktz-xil-ak; mysterious artifact");
        Weapon dagger =  new Dagger("Blade of da noobs");

        Char p1 = new Char("Noman", 90, 100);
        p1.introduce();
        p1.equip(axe);
        
        Char p2 = new Char("Gavin", 90, 100);
        p2.introduce();
        p2.equip(longbow);
        
        p1.attack(p2);
        axe.attack(p2);
        
        p2.attack(p1);
        dagger.attack(p1);
        
        p1.attack(p2);
        axe.attack(p2);
        
        p1.attack(p2);
        axe.attack(p2);
        
        p2.attack(p1);
        dagger.attack(p1);
        
        p1.attack(p2);
        axe.attack(p2);
        
        p2.attack(p1);
        dagger.attack(p1);
        
        p2.attack(p1);
        dagger.attack(p1);
        
        p1.attack(p2);
        axe.attack(p2);
        
        p1.attack(p2);
        axe.attack(p2);
        
        p2.attack(p1);
        dagger.attack(p1);
        
        p1.attack(p2);
        axe.attack(p2);
        
        p1.attack(p2);
        axe.attack(p2);
        
    }
    
}
