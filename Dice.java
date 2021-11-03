public class Dice {

  private int sides;
  private String type;

  public Dice() {
    sides = 6;
    type = "six";
  }

  public Dice(int s, String t) {
    sides = s;
    type = t;
  }

  public int roll() {
    return (int) (Math.random() * sides) + 1;
  }

  public String getType() {
    return type;
  }

  public void setType(int s, String t) {
    sides = s;
    type = t;
  }

  public String toString(){
    return "Im an object";
  }

}