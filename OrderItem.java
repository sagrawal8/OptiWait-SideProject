public class OrderItem {
  private FoodInterface food;
  private int qty;

  public OrderItem(FoodInterface food, int qty) {
    this.qty = qty;
    this.food = food;
  }

  public FoodInterface getFood(){
    return food;
  }

  public int getQty(){
    return qty;
  }

  public void setQty(int qty) {
    this.qty =  qty;
  }

  public String toString(){
    String str = "";
    str += food.toString();
    str += " Quantity: " + qty;
    str += " Total Prep Time: " + food.getPrepTime()*qty;
    return str;
  }
}
