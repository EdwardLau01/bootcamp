package Order;
public class Transaction {
  
  private int itemNo;

  private ItemDesc itemDesc;

  private int quantity;

  private double unitPrice;

  public Transaction(){

  }
  
  public Transaction(int itemNo, ItemDesc itemDesc, int quantity, double unitPrice){
    this.itemNo = itemNo;
    this.itemDesc = itemDesc;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  // getsubtotal() 

  public double getSubTotal (){
    return this.unitPrice * this.quantity;
  }

  public int getItemNo(){
    return this.itemNo;
  }

  public ItemDesc getItemDesc(){
    return this.itemDesc;
  }

  public int getQuantity(){
    return this.quantity;
  }

  public double getUnitPrice(){
    return this.unitPrice;
  }

  public void setItemNo (int itemNo) {
    this.itemNo = itemNo;
  }

  public void setItemDesc (ItemDesc itemDesc) {
    this.itemDesc = itemDesc;
  }

  public void setQuntity (int quantity) {
    this.quantity = quantity;
  }

  public void setUnitPrice (int unitPrice) {
    this.unitPrice = unitPrice;
  }

}
