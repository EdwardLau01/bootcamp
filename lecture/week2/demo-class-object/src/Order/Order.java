package Order;

public class Order {
  
  private Transaction[] transactions;

  public Order(Transaction[] transactions) {
    this.transactions = transactions;
  }

  //getTotal() -> sum up subtotal
}