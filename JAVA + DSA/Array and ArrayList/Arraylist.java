import java.util.*;

public class Arraylist {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Syntax
    /*
     1. Size is fixed internaly
     2. say arraylist fills by some amount
           it will create new arraylist with double the size or some amount of the courrent one 
           then copy the element in the old arralist into new one

     */
    ArrayList <Integer> list = new ArrayList<>();

    list.add(67);
    list.add(6);
    list.add(7);
    list.add(63);

    
    System.out.print(list.contains(12));
    System.out.print(list);

    // input
    for(int i = 0;i < 10;i++)
    {
      list.add(sc.nextInt());
    }

    //get item
    for(int i = 0;i < 10;i++)
    {
       System.out.print(list.get(i)); // pass index here, list[index] syntax will not work here
    }
   }
}
