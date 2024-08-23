
import java.util.*;
//Every  file that ends with the .java is the class 

// name of this class is Main

public class Main {

  // if we creating a class please make sure that start with capital letter like
  // "Main"

  // The file name class should be in public

  // access specifier public (That class can be accessed by other class , file
  // etc)

  // inside the class we should create a method

  // main function where program start

  // function is the collection of code we can use more time

  // public means it can be accessed from any where

  // class is name group of property and function

  // Main is the name of file

  // file name must same as the class name

  public static void main(String[] args) {

    // main function

    // main function is the important and it is the entry point of the java program

    // if it is not here program will not run

    // static keyword is used to run the main method or function without creating
    // the object of the class

    // string[] args is the command line arguments

    System.out.println("Hello World!");

    // input part of the program

    // System is the class

    // out is the object of the class

    // println is the method of the class

    // println is used to print the output

    // println is used to print the output in the new line

    System.out.println("Hello World!");

    // output part of the program

    Scanner sc = new Scanner(System.in);

    // Scanner is the class

    // sc is the object of the class

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

  }
}
