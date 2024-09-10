
class Example {
  public static void main(String[] args) {
    /*
     * Syntax of if Statement
     * if(condition)
     * {
     * // code to be executed if the condition is true
     * }else
     * {
     * // code to be executed if the condition is false
     * }
     */

    int salary = 25400;
    // if (salary > 10000) {
    // salary = salary + 2000;
    // } else {
    // salary = salary + 1000;
    // }

    // multiple if-else

    if (salary > 10000) {
      salary += 2000;
    } else if (salary > 20000) {
      salary += 3000;
    } else {
      salary += 1000;
    }

    System.out.printf("%d", salary);
  }
}
