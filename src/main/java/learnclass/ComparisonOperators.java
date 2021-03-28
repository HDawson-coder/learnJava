package learnclass;

import learninterface.LearnInterface;

public class ComparisonOperators {

  private int member;
// What are the different types of methods in an Interface and how do they work?
  public static void main(String[] args) {

    ComparisonOperators comparisonOperators = new ComparisonOperators();
    comparisonOperators.getMember();

    LearnInterface learnInterface = new LearnInterface() {

    };

    int a = 5;
    int b = 4;

    boolean c = (a != b);

    System.out.println(c);
  }

  public int localScope() {
    int practice;
    practice = 1;
    return practice;
  }

  public int getMember() {
    return member;
  }

  public void setMember(int member) {
    this.member = member;
  }
}
;