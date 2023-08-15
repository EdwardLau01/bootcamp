// Builder Pattern Demo

public class Phone {

  private String number;
  private Color color;
  private double weight;

  private Phone(Builder builer) {
    this.number = builer.number;
    this.color = builer.color;
    this.weight = builer.weight;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "[" //
        + "number=" + this.number //
        + ", color=" + this.color //
        + ", weight=" + this.weight //
        + "]";
  }

  public static class Builder {
    // with same attributes of outer class
    private String number;
    private Color color;
    private double weight;

    public Builder number(String number) { // setter
      this.number = number;
      return this;
    }

    public Builder color(Color color) { // setter
      this.color = color;
      return this;
    }

    public Builder weight(double weight) { // setter
      this.weight = weight;
      return this;
    }

    public Phone build() {
      return new Phone(this);
    }
  }

  public static void main(String[] args) {
    Phone phone = Phone.builder() //
        .color(Color.GREY) //
        .number("12345678") //
        .weight(3.7d) //
        .build();

    System.out.println(phone);

    Phone phone2 = Phone.builder().build();

  }
}
