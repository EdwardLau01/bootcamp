package Order;

public class Order {
  
  private Transaction[] transactions;

  public Order(Transaction[] transactions) {
    this.transactions = transactions;
  }

  //getTotal() -> sum up subtotal
  public double getTotal () {
    double sum = 0;
    for (int i = 0; i < this.transactions.length; i++) {
      sum += this.transactions[i].getSubTotal();
    }
    return sum;


  }
}