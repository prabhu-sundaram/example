package dataTypePkg;

class A {}
class B extends A {}

public class Test {
    static A makeObj(int which) {
        if (which == 0)
            return new A();
        else
            return new B();
    }

    public static void main(String[] args) {
        var myRef = makeObj(1);  // compile-time type = A
        System.out.println(myRef.getClass().getSimpleName()); // prints "B"
        
        // The following line causes a compile-time error:
        // myRef.someBSpecificMethod();  ❌ Not allowed, because myRef is of type A

        var myRef2 = (B) makeObj(1);  // compile-time type = B
        System.out.println(myRef2.getClass().getSimpleName()); // prints "B"
    }
}

