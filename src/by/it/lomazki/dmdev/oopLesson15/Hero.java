package by.it.lomazki.dmdev.oopLesson15;

public class Hero {
    private String name;
    private int canDamage;

    public String getName() {
        return name;
    }

    public Hero(String name, int canDamage) {
        this.name = name;
        this.canDamage = canDamage;
    }

    void attackEnemy(Enemy enemy) {
        System.out.println(name + "attack" + enemy.getName());
        enemy.takeDamage(canDamage);
    }

    public int getCanDamage() {
        return canDamage;
    }
}
