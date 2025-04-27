public class test3 {
    public static void main(String[] arge){
        int [] arr =new int[5];
        arr[0] = 2;
        arr[1] = 12;
        arr[3]=70;
        arr[4]=17;
        arr[5]=40;
        int res= Integer.MIN_VALUE;


        for(int i: arr){
            if(arr[i]> res){
                res=arr[i];
            }
        }
        System.out.println(res);
    }
}