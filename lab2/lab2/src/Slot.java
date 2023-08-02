public class Slot {
    private int maxItems;
    private Item[] items;
    private int currentItemsCount;

    private ItemCombiner itemCombiner = new ItemCombiner();

    public Slot(int maxItems, Item[] items) {
        this.maxItems = maxItems;
        this.items = new Item[maxItems];
        this.currentItemsCount = 0;
    }

    public void addItem(Item item) {
        if (!isFull()) {
            items[currentItemsCount++] = item;
        } else {
            System.out.println("Slot is full");
            itemCombiner.combineItems(items[0], item);
        }
    }

    public void removeItem(Item item) {
        for (int i = 0; i < currentItemsCount; i++) {
            if (items[i].equals(item)) {
                // Shift the items to fill the gap
                System.arraycopy(items, i + 1, items, i, currentItemsCount - i - 1);
                items[--currentItemsCount] = null;
                break;
            }
        }
    }

    public boolean isFull() {
        return currentItemsCount == maxItems;
    }

    public boolean containsItem(Item item) {
        for (int i = 0; i < currentItemsCount; i++) {
            if (items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public Item[] getItems() {
        return this.items;
    }
}
