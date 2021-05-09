import java.util.Comparator;

public class Comp implements Comparator<OrderItem> {

  @Override
  public int compare(OrderItem o1, OrderItem o2) {
   if(o1.getFood().getPrepTime()*o1.getQty() > (o2.getFood().getPrepTime()*o2.getQty())) {
      return 1;
    }
    else if(o1.getFood().getPrepTime()*o1.getQty() < (o2.getFood().getPrepTime()*o2.getQty())) {
      return -1;
    }
    return 0;
  }
}
