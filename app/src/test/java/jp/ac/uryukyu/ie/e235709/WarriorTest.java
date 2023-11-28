package jp.ac.uryukyu.ie.e235709;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    void attackWithWeaponSkillTest() {
        Warrior demoWarrior = new Warrior("デモ剣士", 100, 100);
        Enemy demoEnemy1 = new Enemy("スライムもどき1", 150, 0);
        Enemy demoEnemy2 = new Enemy("スライムもどき2", 150, 0);
        Enemy demoEnemy3 = new Enemy("スライムもどき3", 150, 0);
        demoWarrior.attackWithWeaponSkill(demoEnemy1);
        demoWarrior.attackWithWeaponSkill(demoEnemy2);
        demoWarrior.attackWithWeaponSkill(demoEnemy3);
        assertEquals(0, demoEnemy1.getHitPoint()); 
        assertEquals(0, demoEnemy2.getHitPoint()); 
        assertEquals(0, demoEnemy3.getHitPoint()); 
    
    }

}
