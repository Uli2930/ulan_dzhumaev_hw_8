package kg.geeks.game.players;

public class Hacker extends Hero {
    private int takeHealthBoss = 15;

    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.BLACK_HOLE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i  < heroes.length; i++) {
            boss.setHealth(boss.getHealth() - this.takeHealthBoss);
            heroes[i].setHealth(heroes[i].getHealth() + this.takeHealthBoss);
        }
    }
}