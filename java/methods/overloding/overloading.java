 class overloading {

    public static void main(String[] args) {
        int num1 = myOverloadingInt(2, 3); 
        double num2 = myOverloadingDouble(9.1, 4.2); 
        System.out.println(num1);
        System.out.println(num2);
    }


    public static int myOverloadingInt(int x, int y) {
        return x + y;
    }

    
    public static double myOverloadingDouble(double x, double y) {
        return x + y;
    }
}