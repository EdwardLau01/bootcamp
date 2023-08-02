public abstract class GameMember{

  int score;

  public GameMember() {

  }

  public GameMember(int score) {
    this.score = score;
  }

  public int getScore() {
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void addScore(int score) {
    this.score += score;
  }

  public void up(Dog dog) {
    if (this instanceof Dog)
      score++;
  }

  public void print(){
    System.out.println("GameMember is jumping");
  }

  public abstract void up();

  public abstract void down();

  public abstract void right();

  public abstract void left();



  public static void upOnce(GameMember... members) { // multiple args
    for (GameMember member : members) {
      member.up(); // dog / student object
    }
  }

    public static void moveOnce(Move[] members) { // multiple args
    for (Move member : members) {
      member.jump(); // dog / student object
    }
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    GameMember.upOnce(dog, cat);
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());

    Move[] members = new Move[] {dog , cat};
    GameMember.moveOnce(members);
    System.out.println(dog.getScore());
    System.out.println(cat.getScore());

    // interface Move default instance method
    dog.print();
    cat.print();
    // static method
    System.out.println(Move.concat("abc", "def"));

    Cow cow = new Cow();
    cow.print();


  }

}
