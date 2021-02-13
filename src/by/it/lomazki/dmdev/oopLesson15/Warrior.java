package by.it.lomazki.dmdev.oopLesson15;

public class Warrior extends Hero{
    public Warrior(String name, int canDamage) {
        super(name, canDamage);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        System.out.println("Warrior " + this.getName() + " hit with an axe in " + enemy.getName());
        enemy.takeDamage(this.getCanDamage());
    }
}
