package classExamplesPkg;

// This class declares an object of type Vehicle.
class TwoVehicles {
public static void main(String[] args) {
    Vehicle minivan = new Vehicle();
Vehicle sportscar = new Vehicle();
int range1, range2;
// assign values to fields in minivan
minivan.passengers = 7;
minivan.fuelcap = 16;
minivan.mpg = 21;
// assign values to fields in sportscar
sportscar.passengers = 2;
sportscar.fuelcap = 14;
sportscar.mpg = 12;
// compute the ranges assuming a full tank of gas
range1 = minivan.fuelcap * minivan.mpg;
range2 = sportscar.fuelcap * sportscar.mpg;
System.out.println("Minivan can carry " + minivan.passengers +
" with a range of " + range1);
System.out.println("Sportscar can carry " + sportscar.passengers +
" with a range of " + range2);

System.out.print("Minivan can carry " + minivan.passengers +
". ");
minivan.range(); // display range of minivan
System.out.print("Sportscar can carry " + sportscar.passengers +
". ");
sportscar.range(); // display range of sportscar.

//int range1, range2;
// get the ranges
range1 = minivan.range2();
range2 = sportscar.range2();

}
}

