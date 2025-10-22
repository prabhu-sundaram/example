package programControlPkg;

public class ContinueDemo {
public static void main(String[] args) {
int i;
// print even numbers between 0 and 100
for(i = 0; i<=100; i++) {
if((i%2) != 0) continue; // iterate
System.out.println(i);
}
System.out.println("=========================================");

outerloop:
for(i=1; i < 10; i++) {
System.out.print("\nOuter loop pass " + i +
", Inner loop: ");
for(int j = 1; j < 10; j++) {
if(j == 5) continue outerloop; // continue outer loop
System.out.print(j);
}
}
System.out.println("=========================================");



}
}
