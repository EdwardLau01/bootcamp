package shape;

public class DemoShape {
  public static void main (String[] args) {
    Square s1 = Square.valueOf(10.0d) ;
    Square s2 = Square.valueOf(4.0d);
    Square s3 = Square.valueOf("5");

    // s1.getEdges()[0].setColor("YELLOW"); getEdges() is private, cannot use this method

    // System.out.println(s1.getEdges()[0].getColor());
    
    // //getEdges() -> 4 address, getEdges()[0] -> address
    // s1.getEdgdes


    }
}
