package by.it.lomazki.dmdev.oopLesson15;

public class Archer extends Hero {
    public Archer(String name, int canDamage) {
        super(name, canDamage);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        System.out.println("Archer " + this.getName() + " fire a bow in " + enemy.getName());
        enemy.takeDamage(this.getCanDamage());
    }
}
