package inheritPkg.finalPkg;

final class A {
// ...
}
// The following class is illegal.
class B1 extends A { // ERROR! Can't subclass A
// ...
}
