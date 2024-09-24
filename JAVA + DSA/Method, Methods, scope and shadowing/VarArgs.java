import java.util.Arrays;

public class VarArgs {
  public static void main(String[] args) {
    fun();
    fun(2, 3, 4, 5, 6, 7, 6);// variable length arguments

    multiple(2, 3, "dhingar", "roshan", "ameer");
    ;
  }

  static void multiple(int a, int b, String... v) { // variable length arugment should come at the end

  }

  static void fun(int... v) { // is take the value as array and it can be string , char
    System.out.println(Arrays.toString(v));

  }
}
