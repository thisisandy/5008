public class Footwear extends Item implements IEquippable {
    final protected EquippableBodyPart bodyPartToEquip = EquippableBodyPart.LEGS;
    public Footwear(String name,String property, int attackStrength, int defenseStrength) {
        super(name, property, defenseStrength, attackStrength);
    }

    public void equip() {
        // Implementation here
    }

    public void unequip() {
        // Implementation here
    }

    public int calculateTotalAttackDefenseStrength() {
        // Implementation here
        return 0; // Replace with actual implementation
    }
}
