public class Overloading {
  public static void main(String[] args) {
    // Method overloading
    /*
     * same method name but different argument length or different datatype
     * 
     * method overload choose which function or method to run at complie time
     * 
     * in overloading we cant call the function without passing the arguments
     * like fun();
     * because it will confuse at the complie time which function do i do it first
     * so this error called "Ambiquty";
     * 
     */
    fun(2);

    fun("Dhinagar", 21);

    int ans = sum(1, 2);
    System.out.println(ans);

    int ans2 = sum(1, 2, 3);
    System.out.println(ans2);

  }

  static int sum(int a, int b) {
    return a + b;
  }

  static int sum(int a, int b, int c) {
    return a + b + c;
  }

  static void fun(int a) {
    System.out.println(a);
  }

  static void fun(String name, int a) {
    System.out.println(name);
  }
}
