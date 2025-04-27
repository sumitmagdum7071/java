 //note bitiwise operators
 public  class Test4{
    public static void main(String[] args){
   //note bitiwise operators
   //AND OPERATOR &
   // or operator |
   //not ~
   //X OR ^
   // left shift <<
   //right shift>>
   // unsinged right shift >>

       /*  int c = 5 & 4;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
         System.out.println(c);
         System.out.println(Integer.toBinaryString(c));
    */
         int a = 5;
        System.out.println(Integer.toBinaryString(a));
        int c = ~ a << 1;
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
    
        }



 }