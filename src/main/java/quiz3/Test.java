package quiz3;

public class Test {

  Test() {

  }

  int test = 3;
  byte test2 = 127;
  boolean test3 = 0 == 0;
  String result = "";

  {
    switch (test) {

      case 3:
        result = "Brown Fox ";
      case 5:
        result = "Happy Cow ";
        break;
      case 2:
        result = "Lazy Dog ";
      default:
        result = "White Wolf ";
        break;
    }
System.out.println(result);
  }

}



