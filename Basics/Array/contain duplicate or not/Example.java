import java.util.HashSet;

class Example {
  public static void main(String[] args) {
    int[] nums = { 2, 2, 1 };
    int result = 0;
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        result = 1;
        break;
      }
      set.add(num);
    }
    System.out.println(result == 1 ? "Contain duplicate" : "Not contain duplicate");
  }
}
