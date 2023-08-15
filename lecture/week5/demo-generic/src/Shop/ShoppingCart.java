package Shop;

import java.util.ArrayList;

public class ShoppingCart{

  private ArrayList<CheckoutItem> items;

  public ShoppingCart() {
    items = new ArrayList<>();
  }

  public int totalAmount() {
    int sum = 0;
    for (CheckoutItem item : this.items) {
      sum += Math.max(0, item.getPrice()) * Math.max(0, item.getQuantity());
    }
    return sum;
  }

  public void add(int quantity, DisplayItem displayItem) {
    // items.add(item);
    CheckoutItem checkoutItem = //
        new CheckoutItem(quantity, displayItem.getPrice());
    items.add(checkoutItem);
  }

  public boolean remove(CheckoutItem item) {
    return items.remove(item);
  }

  public void clear(){
    this.items.clear();
  }

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    cart.add(0, new Rice());
    // cart.add(new Food()); // food is abstract
    ShoppingCart cart2 = new ShoppingCart();
    ShoppingCart cart3 = new ShoppingCart();
    ShoppingCart cart4 = new ShoppingCart();

  }

}
