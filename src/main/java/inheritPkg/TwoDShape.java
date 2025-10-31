package inheritPkg;

// // A simple class hierarchy.
// // A class for two-dimensional objects.
// class TwoDShape {
// double width;
// double height;

// void showDim() {
// System.out.println("Width and height are " +
// width + " and " + height);
// }
// }

// // Use accessor methods to set and get private members.
// // A class for two-dimensional objects.
// class TwoDShape {
// private double width; // these are
// private double height; // now private

// // Accessor methods for width and height.
// double getWidth() { return width; }
// double getHeight() { return height; }
// void setWidth(double w) { width = w; }
// void setHeight(double h) { height = h; }

// void showDim() {
// System.out.println("Width and height are " +
// width + " and " + height);
// }
// }

// // Add constructors to TwoDShape.
// class TwoDShape {
// private double width;
// private double height;
// // Parameterized constructor.
// TwoDShape(double w, double h) {
// width = w;
// height = h;
// }
// // Accessor methods for width and height.
// double getWidth() { return width; }
// double getHeight() { return height; }
// void setWidth(double w) { width = w; }
// void setHeight(double h) { height = h; }
// void showDim() {
// System.out.println("Width and height are " +
// width + " and " + height);
// }
// }

// // Add more constructors to TwoDShape.
// class TwoDShape {
// private double width;
// private double height;

// // A default constructor.
// TwoDShape() {
// width = height = 0.0;
// }

// // Parameterized constructor.
// TwoDShape(double w, double h) {
// width = w;
// height = h;
// }

// // Construct object with equal width and height.
// TwoDShape(double x) {
// width = height = x;
// }

// // Accessor methods for width and height.
// double getWidth() { return width; }
// double getHeight() { return height; }
// void setWidth(double w) { width = w; }
// void setHeight(double h) { height = h; }

// void showDim() {
// System.out.println("Width and height are " +
// width + " and " + height);
// }
// }

// Add more constructors to TwoDShape.
class TwoDShape {
private double width;
private double height;

// A default constructor.
TwoDShape() {
width = height = 0.0;
}

// Parameterized constructor.
TwoDShape(double w, double h) {
width = w;
height = h;
}

// Construct object with equal width and height.
TwoDShape(double x) {
width = height = x;
}

// Construct an object from an object.
TwoDShape(TwoDShape ob) {
width = ob.width;
height = ob.height;
}

// Accessor methods for width and height.
double getWidth() { return width; }
double getHeight() { return height; }
void setWidth(double w) { width = w; }
void setHeight(double h) { height = h; }

void showDim() {
System.out.println("Width and height are " +
width + " and " + height);
}
}
