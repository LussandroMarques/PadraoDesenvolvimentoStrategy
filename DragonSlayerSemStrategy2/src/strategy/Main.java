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
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Green dragon spotted ahead!");
    DragonSlayer dragonSlayer;
      dragonSlayer = new DragonSlayer(new MeleeStrategy());
    dragonSlayer.goToBattle();
      System.out.println("Red dragon emerges.");
    dragonSlayer.changeStrategy(new ProjectileStrategy());
    dragonSlayer.goToBattle();
      System.out.println("Black dragon lands before you.");
    dragonSlayer.changeStrategy(new SpellStrategy());
    dragonSlayer.goToBattle();
    }
}
