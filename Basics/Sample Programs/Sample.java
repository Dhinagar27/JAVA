class Sample {
    public static void main(String[] args) {

        int age = 10;

        // println used to print in next line
        System.out.println("Hello world");
        System.out.println("This is My Age :" + age);

        // printf
        System.out.printf("This is My Age : %d", age);

        // escape sequence
        System.out.printf("\n%%");
        System.out.printf("\n//");

        // width space (if the width space is exceeded with the input string it will not
        // affect the output)
        System.out.printf("\n%05d", age);

        float num1 = 1.2f;
        double num2 = 2.4f;

        // precision
        System.out.printf("\n%.2f", num1);
        System.out.printf("\n%.4f", num2);

    }
}