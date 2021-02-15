package by.it.lomazki.dmdev.oopLesson15;

public abstract class Hero {
    private String name;
    private int canDamage;

    public String getName() {
        return name;
    }

    public Hero(String name, int canDamage) {
        this.name = name;
        this.canDamage = canDamage;
    }

    abstract void attackEnemy(Enemy enemy);

    public int getCanDamage() {
        return canDamage;
    }
}
