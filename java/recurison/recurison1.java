class recurison1{
    public static void main(String[] args) {
        //5!=5*4!
        System.out.println(sumOFNNaturalNumbers(6));

    }
    public static int sumOFNNaturalNumbers(int n){
        if (n==1) {
            return 1;
        }
        return n + sumOFNNaturalNumbers(n-1);
    }
}
