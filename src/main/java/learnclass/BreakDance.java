package learnclass;

public class BreakDance {

    private static int initialize(int value) {
      System.out.println("initialize");
      return value;
    }

    private static boolean test(int value, int limit) {
      System.out.println("test");
      return value < limit;
    }

    private static int next(int value) {
      System.out.println("next");
      return value + 1;
    }

    public static void main(String[] args) {
      for (int i = initialize(0); test(i, 3); i = next(i)) {
        if (i % 2 == 1) {
          break;
        }
      }
      System.out.println("done");
    }

  }
