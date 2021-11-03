class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to my Dice Program");

    Dice d6 = new Dice();

    for (int i = 0; i < 100; i++) {
      System.out.println(d6.roll());
    }

    Dice d20 = new Dice(20, "twenty");
    System.out.println(d20.roll());

    System.out.println(d6.getType());
    System.out.println(d20.getType());

    d6.setType(100,"hundred");
    System.out.println("sided "+d6.getType()+" rolled "+d6.roll());

    System.out.println(d6);
    System.out.println(d20);
    
  }
}