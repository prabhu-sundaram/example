package inheritPkg.dynamicDispatch;

// Use dynamic method dispatch.
class TwoDShape {
private double width;
private double height;
private String name;

// A default constructor.
TwoDShape() {
width = height = 0.0;
name = "none";
}

// Parameterized constructor.
TwoDShape(double w, double h, String n) {
width = w;
height = h;
name = n;
}

// Construct object with equal width and height.
TwoDShape(double x, String n) {
width = height = x;
name = n;
}

// Construct an object from an object.
TwoDShape(TwoDShape ob) {
width = ob.width;
height = ob.height;
name = ob.name;
}

// Accessor methods for width and height.
double getWidth() { return width; }
double getHeight() { return height; }
void setWidth(double w) { width = w; }
void setHeight(double h) { height = h; }

String getName() { return name; }

void showDim() {
System.out.println("Width and height are " +
width + " and " + height);
}

double area() {
System.out.println("area() must be overridden");
return 0.0;
}
}
