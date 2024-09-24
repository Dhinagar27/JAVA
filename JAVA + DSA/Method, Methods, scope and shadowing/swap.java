
public class swap {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    // int temp = a;
    // a = b;
    // b = temp;
    swap(a, b);
    System.out.println(a + " " + b);

    String name = "Dhinagar"; // creating new object;

    changename(name);
    System.out.println(name);
  }

  static void changename(String naam) {
    naam = "D Dhinagar";
  }

  // IN java there is no Pass By reference
  // there only pass by value
  /*
   * if we pass the name in the above example its actualy pass the copy of the
   * refernce varaiables value
   * 
   * In here both the name and naam are pointing to the same object
   */
  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    // this change will only be valid in this function scope only.
  }
}
