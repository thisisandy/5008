package category.Food;
import category.Bird.Bird;
import category.Bird.BirdType;
import java.util.HashMap;
import java.util.Map;

/**
 * Manages the food inventory for different types of birds.
 */
public class FoodManager{
    private final Map<BirdType, Integer> foodMap = new HashMap<>();

    /**
     * Adds food for the given bird.
     * @param bird The bird to add food for.
     */
    public void addFood(Bird bird){
        if(foodMap.containsKey(bird.getType())){
            foodMap.put(bird.getType(), foodMap.get(bird.getType()) + 1);
        }else{
            foodMap.put(bird.getType(), 1);
        }
    }

    /**
     * Gets the food count for the given bird type.
     * @param type The bird type to get the food count for.
     * @return The food count for the given bird type.
     */
    public int getFoodCount(BirdType type){
        return foodMap.get(type);
    }

    /**
     * Gets the total food count across all bird types.
     * @return The total food count.
     */
    public int getTotalFoodCount(){
        int total = 0;
        for (Map.Entry<BirdType, Integer> entry : foodMap.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }
}