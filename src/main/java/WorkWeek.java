public class WorkWeek {

  enum Day {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    @Override
    public String toString() {
      return super.toString().toLowerCase();
    }

    public int workHours() {
      switch (this) {
        case SUNDAY:
        case SATURDAY:
          return 0;
        case FRIDAY:
          return 4;
        default:
          return 8;
      }
    }

  };
    public static void main(String[] args) {
      for (Day day : Day.values()) {
        System.out.printf("%s: %d%n", day, day.workHours());
      }
    }

}
