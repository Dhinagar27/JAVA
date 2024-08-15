
class immutable {
  public static void main(String[] args) {

    String str = "Dhin";

    str.concat("agar"); // this will not add the string because it only refer the "dhin" string only

    System.out.println(str);

    str = str.concat("agar");

    System.out.println(str);

  }
}
