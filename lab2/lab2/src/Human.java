public class Human extends Character {
    public Human(int baseAttack, int baseDefense) {
        super(baseAttack, baseDefense);
    }

    @Override
    public int getLegCount() {
        return 2;
    }

    @Override
    public int getHeadCount() {
        return 1;
    }

    @Override
    public int getArmCount() {
        return 2;
    }
}
