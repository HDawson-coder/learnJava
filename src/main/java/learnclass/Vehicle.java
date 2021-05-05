package learnclass;

class Vehicle {

  int passengers; // number of passengers
  int fuelCap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon

  //Constructor for Vehicle
  Vehicle(int p, int f, int m) {
    passengers = p;
    fuelCap = f;
    mpg = m;
  }

  //return the range
  int range() {
    return mpg * fuelCap;
  }

  //compute fuel needed for a given distance.
  double fuelNeeded(int miles) {
    return (double) miles / mpg;
  }
}

  class VehicleConstructorDemo {

    public static void main(String[] args) {
      //construct complete vehicles
      Vehicle minivan = new Vehicle(7, 16, 21);
      Vehicle sportsCar = new Vehicle(2, 14, 12);
      double gallons;
      int distance = 252;

      gallons = minivan.fuelNeeded(distance);

      System.out.println("To go "
          + distance
          + " miles minivan needs "
          + gallons
          + " gallons of fuel.");

      gallons = sportsCar.fuelNeeded(distance);

      System.out.println("To go"
          + distance
          + " miles sportsCar needs "
          + gallons
          + " gallons of fuel.");
    }
  }

