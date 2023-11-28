package jp.ac.uryukyu.ie.e235709;

public class Warrior extends LivingThing {
    public Warrior(String name,int hitPoint,int damage){
        super(name,hitPoint,damage);
    }

    public void attackWithWeaponSkill(LivingThing enemy){
        if(isDead() == false){
            int damage  = (int)(getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), enemy.getName(), damage);
            enemy.wounded(damage);
        }
    }
}
