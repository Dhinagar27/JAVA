
import java.util.Scanner;

public class example {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Type casting and Conversion

    float num = sc.nextInt(); // Here we are converting the integer value to the float value
                              // this is called the type casting
                              // type casting is the process of converting the one data type to the another
                              // data type
                              // left side is the destination data type and right side is the source data type
                              // left side should be the bigger than the right side

    // int num1 = sc.nextFloat(); // this will give the error because the left side
    // is the smaller than the right side

    int num2 = (int) 23.5f; // Here we are converting the float value to the integer value
    // this is called the type casting

    // automatic type promotion in expressions
    int a = 257;
    byte b = (byte) a; // 257 % 256 = 1
    System.out.println(b); // here we are converting the int value to the byte value

    byte c = 40;
    byte d = 50;
    byte e = 100;

    int f = c * d / e; // here we are converting the byte value to the int value

    // byte x = 42;
    // x = x + 8; // here we are converting the int value to the byte value

    int number = 'a';
    System.err.println(number); // here it will print the ASCII value of the character

    System.out.println(f);

    System.out.println(num2);
    System.out.println(num);

    // Type casting example

    byte x = 42;
    char y = 'a';
    short z = 1024;
    int w = 50000;
    float f1 = 5.67f;
    double d1 = 0.1234;

    double result = (f1 * x) + (w / y) - (z * d1);

    // float + int - double = double

    System.out.println((f1 * x) + " " + (w / y) + " " + (z * d1));
    System.out.println(result);

    sc.close();
  }

}
