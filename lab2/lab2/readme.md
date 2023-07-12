
1. **Test Case: Character Creation**
    - **Condition**: A new character is created.
    - **Example**: Create a new `Human` character with base attack 10 and base defense 10.
    - **Expected Result**: A `Human` character is created with base attack 10 and base defense 10.

2. **Test Case: Item Creation**
    - **Condition**: A new item is created.
    - **Example**: Create a new `HeadGear` item with name "Helmet", attack strength 0 and defense strength 5.
    - **Expected Result**: A `HeadGear` item is created with name "Helmet", attack strength 0 and defense strength 5.

3. **Test Case: Equip Item**
    - **Condition**: A character equips an item.
    - **Example**: The `Human` character equips the "Helmet".
    - **Expected Result**: The "Helmet" is added to the character's inventory and the character's total defense increases by 5.

4. **Test Case: Unequip Item**
    - **Condition**: A character unequips an item.
    - **Example**: The `Human` character unequips the "Helmet".
    - **Expected Result**: The "Helmet" is removed from the character's inventory and the character's total defense decreases by 5.

5. **Test Case: Inventory Full**
    - **Condition**: A character tries to equip an item when the inventory is full.
    - **Example**: The `Human` character tries to equip a third `HandGear` item.
    - **Expected Result**: The operation fails and an exception is thrown.

6. **Test Case: Combine Items**
    - **Condition**: Two items of the same type are combined.
    - **Example**: Combine two `Footwear` items, "Boots" with attack strength 2 and defense strength 1, and "Sneakers" with attack strength 1 and defense strength 2.
    - **Expected Result**: A new `Footwear` item is created with name "Boots, Sneakers", attack strength 3 and defense strength 3.

7. **Test Case: Initialize Inventory Slots**
    - **Condition**: The inventory slots are initialized based on the character type.
    - **Example**: Initialize the inventory slots for a `Human` character.
    - **Expected Result**: The inventory has 1 slot for `HeadGear`, 2 slots for `HandGear`, and 2 slots for `Footwear`.

8. **Test Case: Equip More Items Than Slots**
    - **Condition**: A character tries to equip more items than the available slots.
    - **Example**: The `Human` character tries to equip a second `HeadGear` item.
    - **Expected Result**: The operation fails and an exception is thrown.

9. **Test Case: Unequip Item Not In Inventory**
    - **Condition**: A character tries to unequip an item that is not in the inventory.
    - **Example**: The `Human` character tries to unequip a `HandGear` item that is not in the inventory.
    - **Expected Result**: The operation fails and an exception is thrown.

10. **Test Case: Calculate Total Attack and Defense**
    - **Condition**: The total attack and defense of a character are calculated.
    - **Example**: Calculate the total attack and defense of a `Human` character with base attack 10, base defense 10, and equipped with a `HeadGear` item with defense strength 5, two `HandGear` items with attack strength 3 each, and two `Footwear` items with attack strength 2 and defense strength 2 each.
    - **Expected Result**: The total attack is 20 and the total defense is 19.