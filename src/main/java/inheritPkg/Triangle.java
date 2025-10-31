package inheritPkg;

// // A subclass of TwoDShape for triangles.
// class Triangle extends TwoDShape {
// String style;

// double area() {
// return width * height / 2;
// }

// void showStyle() {
// System.out.println("Triangle is " + style);
// }
// }

// // A subclass of TwoDShape for triangles.
// class Triangle extends TwoDShape {
// String style;

// double area() {
// return getWidth() * getHeight() / 2;
// }

// void showStyle() {
// System.out.println("Triangle is " + style);
// }
// }

// // A subclass of TwoDShape for triangles.
// class Triangle extends TwoDShape {
// private String style;
// // Constructor
// Triangle(String s, double w, double h) {
// setWidth(w);
// setHeight(h);
// style = s;
// }
// double area() {
// return getWidth() * getHeight() / 2;
// }
// void showStyle() {
// System.out.println("Triangle is " + style);
// }
// }

// // A subclass of TwoDShape for triangles.
// class Triangle extends TwoDShape {
// private String style;

// Triangle(String s, double w, double h) {
// super(w, h); // call superclass constructor
// style = s;
// }

// double area() {
// return getWidth() * getHeight() / 2;
// }

// void showStyle() {
// System.out.println("Triangle is " + style);
// }
// }

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
private String style;

// A default constructor.
Triangle() {
super();
style = "none";
}

// Constructor
Triangle(String s, double w, double h) {
super(w, h); // call superclass constructor
style = s;
}

// One argument constructor.
Triangle(double x) {
super(x); // call superclass constructor
style = "filled";
}

// Construct an object from an object.
Triangle(Triangle ob) {
super(ob); // pass object to TwoDShape constructor
style = ob.style;
}

double area() {
return getWidth() * getHeight() / 2;
}

void showStyle() {
System.out.println("Triangle is " + style);
}
}
