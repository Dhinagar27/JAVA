public class Scope {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    {
      // Block scope

      // int a = 70; alread initialised outside the block in the same method hence you
      // cannot initialised again

      a = 10; // but u can changes or reassing the origin ref variable to some other value
      int c = 90;
      // values initialised in this block, will remain in block
    }

    // System.out.println(c); cannot use outside the block

    // scoping in for loops
    for (int i = 0; i < 2; i++) {
      // in here i is initialised only in the loop
    }
  }

  static void random() {
    // function scope
    int num = 67;
    System.out.println(num);
  }

}
