public class HeadGear extends Item implements IEquippable {
    final protected EquippableBodyPart bodyPartToEquip = EquippableBodyPart.HEAD;
    public HeadGear(String name, String prefix, int attackStrength, int defenseStrength) {
        super(name, prefix, defenseStrength, attackStrength);
    }

    public void equip() {
        // Implementation here
    }

    public void unequip() {
        // Implementation here
    }
}
