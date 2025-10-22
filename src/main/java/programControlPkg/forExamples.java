package programControlPkg;

public class forExamples {


public static void main(String[] args) throws java.io.IOException {

//DecrFor
// A negatively running for loop.
int x;
for(x = 100; x > -100; x -= 5)
System.out.println(x);

System.out.println("=========================================");

// Use commas in a for statement.
int i, j;
for(i=0, j=10; i < j; i++, j--)
System.out.println("i and j: " + i + " " + j);

System.out.println("=========================================");

// Loop until an S is typed.
int i2;
System.out.println("Press S to stop.");
for(i2 = 0; (char) System.in.read() != 'S'; i2++)
System.out.println("Pass #" + i2);

System.out.println("=========================================");
// Parts of the for can be empty.
for(i = 0; i < 10; ) {
System.out.println("Pass #" + i);
i++; // increment loop control var
}
System.out.println("=========================================");

i = 0; // move initialization out of loop
for(; i < 10; ) {
System.out.println("Pass #" + i);
i++; // increment loop control var
}

System.out.println("=========================================");
// The body of a loop can be empty.
int sum = 0;
// sum the numbers through 5
for(i = 1; i <= 5; sum += i++) ;
System.out.println("Sum is " + sum);
System.out.println("=========================================");

// Declare loop control variable inside the for.
int sum2 = 0;
int fact = 1;
// compute the factorial of the numbers through 5
for(int i3 = 1; i3 <= 5; i3++) {
sum2 += i3; // i is known throughout the loop
fact *= i3;
}
// but, i is not known here
System.out.println("Sum is " + sum2);
System.out.println("Factorial is " + fact);
System.out.println("=========================================");

}
}
