 public class Item implements ICombinable, IEquippable {
    private String name;
    private final int attackStrength;
    private final int defenseStrength;

    final protected String prefix;

    protected EquippableBodyPart bodyPartToEquip;

    public Item(String name, String prefix, int defenseStrength, int attackStrength) {
        this.prefix = prefix;
        this.name = name;
        this.attackStrength = attackStrength;
        this.defenseStrength = defenseStrength;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public int getDefenseStrength() {
        return defenseStrength;
    }

     public EquippableBodyPart getBodyPartToEquip() {
            return bodyPartToEquip;
     }


     @Override
     public void equip() {

     }

     @Override
     public void unequip() {

     }

     @Override
     public Item combine(Item item) {
         return new Item(this.getName(), this.getPrefix() + item.getPrefix(), item.getDefenseStrength() + item.getDefenseStrength(), this.getAttackStrength() + item.getAttackStrength());
     }
 }
