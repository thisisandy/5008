import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<EquippableBodyPart, Slot> slots;

    public Inventory(Character character) {
        initializeSlots(character);
    }

    public void addItem(Item item) {
        Slot slot = slots.get(item.getBodyPartToEquip());
        if (!slot.isFull()) {
            slot.addItem(item);
        }
    }

    public void removeItem(Item item) {
        Slot slot = slots.get(item.getBodyPartToEquip());
        if (slot.containsItem(item)) {
            slot.removeItem(item);
        }
    }

    public boolean isFull() {
        for (Slot slot : slots.values()) {
            if (!slot.isFull()) {
                return false;
            }
        }
        return true;
    }

    public void initializeSlots(Character character) {
        for (EquippableBodyPart type : EquippableBodyPart.values()) {
            slots.put(type, new Slot(character.getBodyPartCount(type), new Item[character.getBodyPartCount(type)]));
        }
    }

    public void equipItem(Item item) {
        Slot slot = slots.get(item.getBodyPartToEquip());
        if (!slot.isFull()) {
            slot.addItem(item);
        }
    }

    public void unequipItem(Item item) {
        Slot slot = slots.get(item.getBodyPartToEquip());
        if (slot.containsItem(item)) {
            slot.removeItem(item);
        }
    }

    public Map<EquippableBodyPart, Slot> getSlots() {
        return this.slots;
    }
}
