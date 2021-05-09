/**
 * Class to initialize the different food items that would be on the menu.
 */
public class FoodItem implements FoodInterface{

  private final String name;
  private final double prepTime;
  private final FoodTypes type;

  public FoodItem(String name, double prepTime, FoodTypes type){
    if(name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Food name is null. Can't be initialized.");
    }
    if(prepTime <= 0) {
      throw new IllegalArgumentException("Prep time cannot be equal to or less than 0. Can't be initialized");
    }
    if(type == null) {
      throw new IllegalArgumentException("Food type is null. Can't be initialized");
    }
    this.name = name;
    this.prepTime = prepTime;
    this.type = type;
  }

  @Override
  public String getName(){
    return name;
  }

  @Override
  public double getPrepTime(){
    return prepTime;
  }

  @Override
  public FoodTypes getType(){
    return type;
  }

  @Override
  public String toString(){
    String str = "";
    str += "Name: " + name + ", Prep Time: " + prepTime + ", FoodType: " + type;
    return str;
  }
}
