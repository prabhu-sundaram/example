package classExamplesPkg;

class ConsDemo {
public static void main(String[] args) {

MyClass t1 = new MyClass();
MyClass t2 = new MyClass();
System.out.println(t1.x + " " + t2.x);

MyClass t11 = new MyClass(10);
MyClass t21 = new MyClass(88);
System.out.println(t11.x + " " + t21.x);

}
}
