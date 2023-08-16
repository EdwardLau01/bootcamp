public enum Currency {
  USD(1, "US Dollor"), //
  HKD(2, "Hong Kong Dollor"), //
  CNY(3, "Chinese Yuan Renminbi"), //
  GBP(4, "British Pound Sterling"), //
  ;

  private int id;
  private String desc;

  private Currency(int id, String desc) {
    this.id = id;
    this.desc = desc;
  }

  public String getDesc() {
    return this.desc;
  }

  public int getId() {
    return this.id;
  }

  public static Currency getCurrency(int id) {
    // values()
    for (Currency currency : values()) { // value() means Currency.value()
      if (currency.id == id)
        return currency;
    }
    return null;
  }


  public static void main(String[] args) {
    //valueOf
    System.out.println(Currency.valueOf("HKD").getDesc()); //Hong Kong Dollor
    // System.out.println(Currency.valueOf("HKDS").getDesc()); // not found, ERROR

    Currency hkd = Currency.HKD;
    System.out.println(getCurrency(4)); // GBP
  }
}