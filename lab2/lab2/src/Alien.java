public class Alien extends Character {
    public Alien(int baseAttack, int baseDefense) {
        super(baseAttack, baseDefense);
    }

    public int getLegCount() {
        return 0;
    }

    public int getHeadCount() {
        return 3;
    }

    public int getArmCount() {
        return 8;
    }
}
