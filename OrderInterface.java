import java.util.List;

/**
 * Interface for Order
 */
public interface OrderInterface {
  /**
   * Adds food item to order.
   * @param name food item to be added.
   */
  void addOrderItem(String name, int qty);

  /**
   * Remove food item based on name.
   * @param name name of food to be removed.
   */
  void removeOrderItem(String name);

  /**
   * Edit Order item.
   * @param name name of food to be edited.
   * @param qty new quantity.
   */
  void editOrderQty(String name, int qty);

  /**
   * Returns ArrayList.
   * @return order.
   */
  List<OrderItem> getOrder();

  /**
   * Returns Menu
   * @return menu
   */
  Menu getMenu();
}
