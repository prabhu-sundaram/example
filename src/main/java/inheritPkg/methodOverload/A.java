package inheritPkg.methodOverload;

/* Methods with differing signatures are
overloaded and not overridden. */
class A {
int i, j;

A(int a, int b) {
i = a;
j = b;
}

// display i and j
void show() {
    System.out.println("i and j: " + i + " " + j);
}
}
