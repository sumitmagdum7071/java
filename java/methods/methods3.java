class Methods3 {
    public static void main(String[] args) {
        checkAge(20); // Calling the method
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
        // No need for a return statement here
    }
}