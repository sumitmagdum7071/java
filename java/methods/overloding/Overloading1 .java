 class Overloading1{


    // Method 1: Adds two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers (different number of parameters)
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two doubles (different parameter types)
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Using the first add method
        System.out.println("Sum of 10 and 20: " + add(10, 20));

        // Using the second add method
        System.out.println("Sum of 10, 20, and 30: " + add(10, 20, 30));

        // Using the third add method
        System.out.println("Sum of 10.5 and 20.5: " + add(10.5, 20.5));
    }
}