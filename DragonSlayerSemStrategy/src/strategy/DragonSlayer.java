/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author aluno
 */
public class DragonSlayer {
    
    String strategia;
    
    public void StrategyMelle() {
        System.out.println("With your Excalibur you sever the dragon's head!");
    }
    
    public void StrategyProjectile() {
        System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
    
    public void StrategySpell() {
        System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
    
}
