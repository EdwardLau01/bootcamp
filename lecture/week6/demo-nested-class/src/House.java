public class House {
  private String street;
  private int window;
  private int door;
  private Color color;

  private House(Builder builder) {
    this.street = builder.street;
    this.window = builder.window;
    this.door = builder.door;
    this.color = builder.color;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "[" //
        + "street=" + this.street //
        + ", window=" + this.window //
        + ", door=" + this.door //
        + ", color=" + this.color //
        + "]";
  }

  public static class Builder {
    private String street;
    private int window;
    private int door;
    private Color color;

    public Builder street(String street) {
      this.street = street;
      return this;
    }

    public Builder window(int window) {
      this.window = window;
      return this;
    }

    public Builder door(int door) {
      this.door = door;
      return this;
    }

    public Builder color(Color color) {
      this.color = color;
      return this;
    }

    public House build() {
      return new House(this);
    }

  }

  public static void main(String[] args) {
    House house = House.builder() //
    .street("1road") //
    .window(5) //
    .door(1) //
    .color(Color.BLACK)//
    .build();

    System.out.println(house);
  }
}
