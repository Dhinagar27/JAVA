import java.util.*;

class array {

    public static void main(String[] arsg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        int[] stack = new int[size];

        System.out.println("Enter the element: ");
        for (int i = 0; i < size; i++) {
            stack[i] = sc.nextInt();
        }

        System.out.println("The elements in the stack are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
        int element = 0;
        System.out.println("\n\nAfter poping : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(stack[i] + " ");
            element = element + 1;

        }
        int top = element - 1;
        System.out.println("\nTop element is: " + stack[top]);

        sc.close();

    }

}