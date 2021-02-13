package by.it.lomazki.dmdev.oopLesson15;

public class Mag extends Hero {
    public Mag(String name, int canDamage) {
        super(name, canDamage);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        System.out.println("Mag " + this.getName() + " make a spell in " + enemy.getName());
        enemy.takeDamage(this.getCanDamage());
    }
}
