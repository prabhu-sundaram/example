package methodPkg;

// Primitive types are passed by value.
class Test {
/* This method causes no change to the arguments
used in the call. */
void noChange(int i, int j) {
i = i + j;
j = -j;
}
}
