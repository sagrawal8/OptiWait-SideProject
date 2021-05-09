import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Menu for Restaurant.
 */
public class Menu implements MenuInterface {

  //Menu
  static HashMap<FoodTypes, List<FoodInterface>> menu;

  public Menu() {
    menu = new HashMap<>();
  }

  @Override
  public void addMenuItem(FoodInterface item) {
    if (item == null) {
      throw new IllegalArgumentException("Food to add is null");
    }
    if (!menu.containsKey(item.getType())) {
      menu.put(item.getType(), new ArrayList<>());
    } else {
      List<FoodInterface> list = menu.get(item.getType());
      for (FoodInterface each : list) {
        if (each.getName().equalsIgnoreCase(item.getName())) {
          return;
        }
      }
    }
    menu.get(item.getType()).add(item);
  }

  @Override
  public void removeMenuItem(String name, FoodTypes type) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name to remove is null or empty. Can't remove.");
    }

    if (menu.containsKey(type)) {
      List<FoodInterface> list = menu.get(type);
      for (FoodInterface each : list) {
        if (each.getName().equalsIgnoreCase(name)) {
          list.remove(each);
          break;
        }
      }
      if (menu.get(type).size() == 0) {
        menu.remove(type);
      }
    }
  }

  @Override
  public void removeMenuItem(FoodInterface item) {
    if (item == null) {
      throw new IllegalArgumentException("Item is null. Can't remove.");
    }

    if (menu.containsKey(item.getType())) {
      List<FoodInterface> list = menu.get(item.getType());
      for (FoodInterface each : list) {
        if (each.getName().equalsIgnoreCase(item.getName())) {
          list.remove(each);
          break;
        }
      }
    }
  }

  @Override
  public FoodInterface getFoodItem(String name) {
    if(name == null){
      throw new IllegalArgumentException("Name of food to find is null.");
    }
    for (Map.Entry<FoodTypes, List<FoodInterface>> entry : menu.entrySet()) {
      List<FoodInterface> list = entry.getValue();
      for (FoodInterface each : list) {
        if(each.getName().equalsIgnoreCase(name)) {
          return each;
        }
      }
    }
    return null;
  }

  @Override
  public String toString() {
    String str = "";
    for (Map.Entry<FoodTypes, List<FoodInterface>> entry : menu.entrySet()) {
      List<FoodInterface> list = entry.getValue();
      str += entry.getKey() + ":\n";
      for (FoodInterface each : list) {
        str += each.toString();
      }
      str += "------------------------\n";
    }
    if (str.isEmpty()) {
      str += "Menu is empty.";
    }
    return str;
  }

  @Override
  public HashMap getMenu() {
    return menu;
  }

}
