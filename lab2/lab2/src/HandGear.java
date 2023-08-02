public class HandGear extends Item implements IEquippable {
    final protected EquippableBodyPart bodyPartToEquip = EquippableBodyPart.ARMS;
    public HandGear(String name, String prefix, int attackStrength, int defenseStrength) {
        super(name, prefix , defenseStrength, attackStrength);
    }

    public void equip() {
        // Implementation here
    }

    public void unequip() {
        // Implementation here
    }

    public int calculateTotalAttackStrength() {
        return getAttackStrength();
    }

}
