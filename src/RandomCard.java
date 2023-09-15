import java.util.Random;

public class RandomCard {
  public static void main(String[] args) {
    new RandomCard().run();
  }

  private void run() {
    for (int i = 0; i < 25; i++) {
      System.out.println(chooseRandomCard());
    }
  }

  private String chooseRandomCard() {
    String[] suits = {"\u2665", "\u2663", "\u2666", "\u2660"};
    Random random = new Random();

    String card = "";
    int value = random.nextInt(13) + 1;
    if (!testValue(value))
      System.out.print("FAILED: ");
    String color = suits[random.nextInt(4)];
    card = color + " " + value;

    return card;
  }

  private boolean testValue(int i) {
    if (i >= 1 && i <= 13)
      return true;
    else
      return false;
  }
}
