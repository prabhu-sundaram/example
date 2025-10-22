package programControlPkg;

import java.io.IOException;

public class WhileDemo {
public static void main(String[] args) throws IOException{
char ch;
// print the alphabet using a while loop
ch = 'a';
while(ch <= 'z') {
System.out.print(ch);
ch++;
}

System.out.println("=========================================");

int e;
int result;
for(int i=0; i < 10; i++) {
result = 1;
e = i;
while(e > 0) {
result *= 2;
e--;
}
System.out.println("2 to the " + i +
" power is " + result);
}
System.out.println("=========================================");
//char ch;
System.out.println(ch);
do {
System.out.print("Press a key followed by ENTER: ");
ch = (char) System.in.read(); // get a char
} while(ch != 'q');

System.out.println("=========================================");
char  ignore, answer = 'K';
do {
System.out.println("I'm thinking of a letter between A and Z.");
System.out.print("Can you guess it: ");
// read a character
ch = (char) System.in.read();
// discard any other characters in the input buffer
do {
ignore = (char) System.in.read();
} while(ignore != '\n');
if(ch == answer) System.out.println("** Right **");
else {
System.out.print("...Sorry, you're ");
if(ch < answer) System.out.println("too low");
else System.out.println("too high");
System.out.println("Try again!\n");
}
} while(answer != ch);

System.out.println("=========================================");


}
}
