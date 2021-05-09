import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOrder implements OrderInterface {

  //Order
  protected List<OrderItem> incomingOrder;
  protected Menu menu;

  public AbstractOrder(Menu menu) {
    new Comp();
    incomingOrder = new ArrayList<>();
    this.menu = menu;
  }

  @Override
  public void addOrderItem(String name, int qty) {
    if (name == null) {
      throw new IllegalArgumentException("Name of food to add is null");
    }
    if(qty <= 0) {
      throw new IllegalArgumentException("Quantity of food to add is less than or equal to 0.");
    }
    FoodInterface item = menu.getFoodItem(name);
    if(item == null) {
      throw new IllegalArgumentException("Name not found in menu.");
    }
    OrderItem orderItem = new OrderItem(item, qty);
    incomingOrder.add(orderItem);
  }

  @Override
  public void removeOrderItem(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name to remove is null or empty. Can't remove.");
    }
    for(OrderItem each : incomingOrder) {
      if(each.getFood().getName().equalsIgnoreCase(name)) {
        incomingOrder.remove(each);
        break;
      }
    }
  }

  @Override
  public void editOrderQty(String name, int qty) {
    if (name == null) {
      throw new IllegalArgumentException("Name of food to edit is null");
    }
    if(qty <= 0) {
      throw new IllegalArgumentException("Quantity of food to edit is less than or equal to 0.");
    }
    for(OrderItem each : incomingOrder) {
      if(each.getFood().getName().equalsIgnoreCase(name)) {
        each.setQty(qty);
        break;
      }
    }
  }

  @Override
  public String toString() {
    incomingOrder.sort(new Comp());
    String str = "";
    for (OrderItem each : incomingOrder) {
      str += each.toString() + "\n";
    }
    if (str.isEmpty()) {
      str += "Order is empty.";
    }
    return str;
  }

  @Override
  public List<OrderItem> getOrder() {
    return incomingOrder;
  }

  @Override
  public Menu getMenu(){
    return menu;
  }
}
