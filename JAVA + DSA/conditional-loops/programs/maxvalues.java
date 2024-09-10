import java.util.Scanner;

class maxvalues {
  maxvalues() {
  }

  public static void main(String[] var0) {
    Scanner var1 = new Scanner(System.in);
    int var2 = var1.nextInt();
    int var3 = var1.nextInt();
    int var4 = var1.nextInt();
    int var5 = Math.max(var4, Math.max(var2, var3));
    System.out.println(var5);
    var1.close();
  }
}
