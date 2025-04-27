

 class Recursion2 {
    public static void main(String[] args) {
        int result = sum(10); // Call the sum method with an argument
        System.out.println(result); // Print the result
    }

    public static int sum(int k) { // Define the sum method
        if (k > 0) {
            return k + sum(k - 1); // Recursive call
        } else {
            return 0; // Base case
        }
    }
}