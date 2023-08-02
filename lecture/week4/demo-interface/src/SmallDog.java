public class SmallDog extends Dog {

  //jump()
  @Override
  public void jump() { // this is the contract from Class Dog 
    super.addScore(5);

  }
  public static void main(String[] args) {
    SmallDog sd = new SmallDog();

    sd.up();
    sd.jump();

    System.out.println(sd.getScore());
  }
  
}
