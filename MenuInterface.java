import java.util.HashMap;

/**
 * Interface for Menu.java
 */
public interface MenuInterface {

  /**
   * Adds food item to menu.
   * @param item food item to be added.
   */
  void addMenuItem(FoodInterface item);

  /**
   * Remove food item based on name and type of food. <O(n) complexity.
   * @param name name of food to be removed.
   * @param type type of food to be removed.
   */
  void removeMenuItem(String name, FoodTypes type);

  /**
   * Remove food item based on object. <O(n) complexity.
   * @param item food item to be removed.
   */
  void removeMenuItem(FoodInterface item);

  /**
   * Gets Food Item from menu.
   *
   * @param name name of food item to find.
   */
  FoodInterface getFoodItem(String name);

  /**
   * Returns HashMap.
   * @return menu.
   */
  HashMap getMenu();
}
