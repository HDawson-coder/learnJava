package learnclass;

public class Test {

  private static final int DEFAULT_VALUE = 10;

  private static boolean check(int val) {
    return val % 2 == 1;
  }

  public static void main(String[] args) {
    int data = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_VALUE;
    System.out.printf("%d is %s", data, (check(data) ? "odd" : "even"));
  }

}
