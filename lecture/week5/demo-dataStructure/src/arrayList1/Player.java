package arrayList1;
public interface Player {

  int calculateScore();
  int totalScore();

  public static void fillThePocket(Pocket pocket) {
    while (!pocket.isFull()) {
      // Random a ball with a ramdom color
      pocket.add(Ball2.random());
    }
  }
}
