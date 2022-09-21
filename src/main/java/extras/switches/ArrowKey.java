package extras.switches;

public class ArrowKey {
  public static void main(String[] args) {
      String text = "test3";

    switch (text) {
      case "test1" -> System.out.println(text + " ArrowKey: 1");

      case "test2", "test3" -> {
        System.out.println(text + " ArrowKey: 2");
        System.out.println(text + " ArrowKey: 3");
      }

      default -> System.out.println(text + " ArrowKey:  Others");
    }
  }
}