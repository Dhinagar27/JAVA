class example {

    static {
        System.out.println("This is from static block");
    }

    {
        System.out.println("This is from instance block");
    }

    public static void main(String[] args) {

        System.out.println("This is from main block");
        example obj = new example();
    }
}