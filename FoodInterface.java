/**
 * Interface for FoodItem.java.
 */
public interface FoodInterface {

  /**
   * Getter method for food name.
   * @return name of food.
   */
  String getName();

  /**
   * Getter method for food prep time.
   * @return prep time of food.
   */
  double getPrepTime();

  /**
   * Getter method for type of food.
   * @return type of food.
   */
  FoodTypes getType();

  /**
   * Returns food item in String form.
   * @return String of food details.
   */
  String toString();
}
