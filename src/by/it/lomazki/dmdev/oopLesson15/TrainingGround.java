package by.it.lomazki.dmdev.oopLesson15;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Geoge", 20);
        Hero archer = new Archer("Andre", 10);
        Hero mag = new Mag("Oleg", 15);

        Enemy enemy = new Enemy(100, "Sacha");

        attackEnemy(enemy, warrior, archer, mag);
    }

    public static void attackEnemy (Enemy enemy, Hero... heroes){
        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }
    }

}
