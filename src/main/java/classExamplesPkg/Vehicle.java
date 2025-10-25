package classExamplesPkg;

// A program that uses the Vehicle class.
class Vehicle {
int passengers; // number of passengers
int fuelcap; // fuel capacity in gallons
int mpg; // fuel consumption in miles per gallon

// This is a constructor for Vehicle.
Vehicle(int p, int f, int m) {
passengers = p;
fuelcap = f;
mpg = m;
}

// Display the range.
void range() {
System.out.println("Range is " + fuelcap * mpg);
}

// Return the range.
int range2() {
return mpg * fuelcap;
}

// Compute fuel needed for a given distance.
double fuelNeeded(int miles) {
return (double) miles / mpg;
}

}