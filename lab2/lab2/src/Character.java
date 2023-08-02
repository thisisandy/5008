import java.util.HashMap;

abstract public class Character implements WithLegs, WithHead, WithArms {
    private int baseAttack;
    private int baseDefense;
    private Inventory inventory;

    private HashMap<EquippableBodyPart, Integer> bodyParts;

    public Character(int baseAttack, int baseDefense) {
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.inventory = new Inventory(this);
        this.bodyParts = new HashMap<EquippableBodyPart, Integer>() {{
            put(EquippableBodyPart.HEAD, getHeadCount());
            put(EquippableBodyPart.ARMS,getArmCount());
            put(EquippableBodyPart.LEGS, getLegCount());
        }};
    }

    public int calculateTotalAttack() {
        int totalAttack = baseAttack;
        for (Slot slot : inventory.getSlots().values()) {
            for (Item item : slot.getItems()) {
                totalAttack += item.getAttackStrength();
            }
        }
        return totalAttack;
    }

    public int calculateTotalDefense() {
        int totalDefense = baseDefense;
        for (Slot slot : inventory.getSlots().values()) {
            for (Item item : slot.getItems()) {
                totalDefense += item.getDefenseStrength();
            }
        }
        return totalDefense;
    }

    public boolean canEquipMoreItems() {
        for (Slot slot : inventory.getSlots().values()) {
            if (!slot.isFull()) {
                return true;
            }
        }
        return false;
    }

    public int getBodyPartCount(EquippableBodyPart equipmentType) {
        return bodyParts.get(equipmentType);
    }
}
