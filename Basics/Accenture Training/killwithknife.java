import java.util.LinkedList;

public class killwithknife {

  public static void main(String[] args) {
    int n = 20; // Total number of people in the circle

    // Create a circular list of people
    LinkedList<Integer> people = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      people.add(i);
    }

    int index = 0; // Start at the first person

    // Eliminate people until only one person remains
    while (people.size() > 1) {
      index = (index + 1) % people.size(); // Move to the next person in the circle
      people.remove(index); // Remove (eliminate) that person
    }

    // Output the last remaining person (the winner)
    System.out.println("The winner is: " + people.get(0));
  }
}
