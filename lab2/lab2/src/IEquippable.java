public interface IEquippable {
    void equip();
    void unequip();
}

public interface ICombinable {
    Item combine(Item item);
}

public class Item {
    private String name;
    private int attackStrength;
    private int defenseStrength;

    public Item(String name, int attackStrength, int defenseStrength) {
        this.name = name;
        this.attackStrength = attackStrength;
        this.defenseStrength = defenseStrength;
    }

    public String getName() {
        return name;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public int getDefenseStrength() {
        return defenseStrength;
    }
}

public class HeadGear extends Item implements IEquippable {
    public HeadGear(String name, int attackStrength, int defenseStrength) {
        super(name, attackStrength, defenseStrength);
    }

    public void equip() {
        // Implementation here
    }

    public void unequip() {
        // Implementation here
    }
}

public class HandGear extends Item implements IEquippable {
    public HandGear(String name, int attackStrength, int defenseStrength) {
        super(name, attackStrength, defenseStrength);
    }

    public void equip() {
        // Implementation here
    }

    public void unequip() {
        // Implementation here
    }

    public int calculateTotalAttackStrength() {
        // Implementation here
        return 0; // Replace with actual implementation
    }
}

public class Footwear extends Item implements IEquippable {
    public Footwear(String name, int attackStrength, int defenseStrength) {
        super(name, attackStrength, defenseStrength);
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

public class Character {
    private int baseAttack;
    private int baseDefense;
    private Inventory inventory;

    public Character(int baseAttack, int baseDefense, Inventory inventory) {
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.inventory = inventory;
    }

    public int calculateTotalAttack() {
        // Implementation here
        return 0; // Replace with actual implementation
    }

    public int calculateTotalDefense() {
        // Implementation here
        return 0; // Replace with actual implementation
    }

    public boolean canEquipMoreItems() {
        // Implementation here
        return false; // Replace with actual implementation
    }
}

public class Human extends Character {
    public Human(int baseAttack, int baseDefense, Inventory inventory) {
        super(baseAttack, baseDefense, inventory);
    }
}

public class Alien extends Character {
    public Alien(int baseAttack, int baseDefense, Inventory inventory) {
        super(baseAttack, baseDefense, inventory);
    }
}

public class Inventory {
    private Slot[] slots;

    public Inventory(Slot[] slots) {
        this.slots = slots;
    }

    public void addItem(Item item) {
        // Implementation here
    }

    public void removeItem(Item item) {
        // Implementation here
    }

    public boolean isFull() {
        // Implementation here
        return false; // Replace with actual implementation
    }

    public void initializeSlots(Character character) {
        // Implementation here
    }

    public void equipItem(Item item) {
        // Implementation here
    }

    public void unequipItem(Item item) {
        // Implementation here
    }
}

public class Slot {
    private String itemType;
    private int maxItems;
    private Item[] items;

    public Slot(String itemType, int maxItems, Item[] items) {
        this.itemType = itemType;
        this.maxItems = maxItems;
        this.items = items;
    }

    public void addItem(Item item) {
        // Implementation here
    }

    public void removeItem(Item item) {
        // Implementation here
    }

    public boolean isFull() {
        // Implementation here
        return false; // Replace with actual implementation
    }
}

public class ItemCombiner implements ICombinable {
    public Item combineItems(Item item1, Item item2) {
        // Implementation here
        return null; // Replace with actual implementation
    }
}

public class ItemFactory {
    public Item createItem(String type, String name, int attackStrength, int defenseStrength) {
        // Implementation here
        return null; // Replace with actual implementation
    }
}
