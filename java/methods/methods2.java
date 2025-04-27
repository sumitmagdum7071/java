public class methods2 { // Corrected class name to follow Java conventions
    public static void main(String[] args) {
        String res = upperFun(" sumit   "); // Fixed case sensitivity for 'String'
        System.out.println(res);
    }

    public static String upperFun(String str) { // Fixed case sensitivity for 'String'
        return str.trim().toUpperCase(); // Method to trim and convert to uppercase
    }
}