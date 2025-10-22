package programControlPkg;

import java.io.IOException;

public class BreakDemo {
public static void main(String[] args) throws IOException{
int num;
num = 100;
// loop while i-squared is less than num
for(int i=0; i < num; i++) {
if(i*i >= num) break; // terminate loop if i*i >= 100
System.out.print(i + " ");
}
System.out.println("Loop complete.");
System.out.println("=========================================");

char ch;
for( ; ; ) {
ch = (char) System.in.read(); // get a char
if(ch == 'q') break;
}
System.out.println("You pressed q!");

System.out.println("=========================================");
// Using break with nested loops.
for(int i=0; i<3; i++) {
System.out.println("Outer loop count: " + i);
System.out.print(" Inner loop count: ");
int t = 0;
while(t < 100) {
if(t == 10) break; // terminate loop if t is 10
System.out.print(t + " ");
t++;
}
System.out.println();
}
System.out.println("Loops complete.");
System.out.println("=========================================");



}
}
