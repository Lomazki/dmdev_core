package by.it.lomazki.dmdev.oopLesson15;

public class Enemy {
    private int health;
    private String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    void takeDamage(int damage) {
        this.health -= Math.min(health, damage);
        System.out.println(name + " Take a damage " + damage +". It alive on " + getHealth());
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }



}
