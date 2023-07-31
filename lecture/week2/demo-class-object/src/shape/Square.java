package shape;

public class Square {

  private final Edge[] edges;

  // public Square() { // empty constructor
  //   this.edges = new Edge[4];
  //   this.edges[0] = new Edge(3.0d, "RED");
  //   this.edges[1] = new Edge(3.0d, "YELLOW");
  //   this.edges[2] = new Edge(3.0d, "BLACK");
  //   this.edges[3] = new Edge(3.0d, "BLUE");
  // }

  private Square(double length) {
    if (length <= 0.0) {
      length = 1.0d;
    }
    int id = 0;
    this.edges = new Edge[4];
    this.edges[0] = new Edge(++id, length, "RED");
    this.edges[1] = new Edge(++id, length, "RED");
    this.edges[2] = new Edge(++id, length, "RED");
    this.edges[3] = new Edge(++id, length, "RED");
  }5

  public static Square valueOf (double length){
    return new Square(length);
  }

  public static Square valueOf (String length){
    return new Square(Double.valueOf(length));
  }

  public void modify(double length) {
    this.getEdges()[0].setLength(length);
    this.getEdges()[1].setLength(length);
    this.getEdges()[2].setLength(length);
    this.getEdges()[3].setLength(length);
  }

  public void modify(String color) {
    this.getEdges()[0].setColor(color);
    this.getEdges()[1].setColor(color);
    this.getEdges()[2].setColor(color);
    this.getEdges()[3].setColor(color);
  }

  public void modify(int edgeId , String color) {
    this.getEdges()[edgeId].setColor(color);
  }

  private Edge[] getEdges() {
    return this.edges;
  }

  public Edge getEdge(int edgeId){
    return this.edges[edgeId -1];
  }
}
