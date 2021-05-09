public class PickupOrder extends AbstractOrder{

  private final OrderTypes orderType;

  public PickupOrder(Menu menu){
    super(menu);
    orderType = OrderTypes.PickUp;
  }

  public OrderTypes getOrderType(){
    return orderType;
  }
}
