import java.util.Scanner;

public class example {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // input part of the program

    // System is the class
    // out is the object of the class
    // println is the method of the class
    // println is used to print the output
    // println is used to print the output in the new line
    System.out.println("Hello World!");

    // output part of the program

    // Scanner scs = new Scanner(System.in);

    // Scanner is the class
    // scs is the object of the class
    // new is the keyword used to create the object of the class
    // Scanner(System.in) is the constructor of the class
    sc.nextInt();

    // nextInt is the method of the class
    // nextInt is used to take the integer input from the user
    System.out.println(sc.nextInt());

    System.out.println(sc.next()); // next is used to take the string input from the user it only take the first
                                   // word

    System.out.println(sc.nextLine()); // nextLine is used to take the string input from the user

    sc.close();

    float a = sc.nextFloat();
    System.out.println(a);

    double b = sc.nextDouble();
    System.out.println(b);

    char c = sc.next().charAt(0);
    System.out.println(c);

    sc.close();

  }
}
