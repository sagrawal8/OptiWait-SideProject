public class DineInOrder extends AbstractOrder {

  private final OrderTypes orderType;

  public DineInOrder(Menu menu) {
    super(menu);
    orderType = OrderTypes.DineIn;
  }

  public OrderTypes getOrderType() {
    return orderType;
  }

}
