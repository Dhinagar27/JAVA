import java.util.*;

public class methods {
  public static void main(String[] args) {

    // perform block of code for many times
    sum();
    int ans = sum2();
    System.out.println(ans);

    String msg = greet();
    System.out.println(msg);

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum3 = sum3(a, b);
    System.out.println(sum3);
    // "sum" is function name
    // sum() is calling the function
  }

  // pass the value of numbers when you are calling the methods in main()
  static int sum3(int a, int b)

  {
    return a + b;
  }

  // return the value
  static int sum2() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num2 = sc.nextInt();
    return num + num2;

  }

  static void sum() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println(num + num2);

    sc.close();
  }

  static String greet() {
    String greeting = "How are you";
    return greeting;
  }

  /*
   * 
   * access modifier (look deep in OOP) return _type name(){
   * //body
   * return statement;
   * }
   */

  /*
   * 
   * access modifier (look deep in OOP) return _type name(arguments){
   * //body
   * return statement;
   * }
   */

}
