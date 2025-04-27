public class Test8{
    public static void main(String[] args){
    /*int arr[] = new int [5];
    int[] arr1= {1,12,3,4,5};
    for (int i=0; i<arr1.length; i++){
    System.out.println(arr1[i]);
    
    }
    //this methad is 2025 

    for(int i: arr1){
        System.out.println(i);
    }
*/
// search and element in an array
/*int arr []={4,3,4,5,6};
for(int i: arr){
    if (i==5){
        System.out.println("found");
    }
}
        */
// search the element in an array
        // int []arr =new int[5];
        // arr[0]=2;
        // arr[1]=12;
        // arr[2]=321;
        // arr[3]=-32;
        // arr[4]=22;
        // int res= Integer.MIN_VALUE;

        // for(int i=0; i< arr.length; i++){
        //     if (arr[i]>res){
        //         res = arr[i];
        //     }
        // }
        // System.out.println(res);

        //reverse print array 

        // int [] arr={1,3,43,3,45,6,64,3};
        //     for (int i =arr.length -1; i>=0; i--){
        //         System.out.println(arr[i]); 

                
        //     }
            
        //sum of arry
        // int []arr ={-2,4,55,-3,11,-55,-11,2};
        // int sum = 0;
       
        // for (int i : arr){
        //     sum+=i;
        // }
        //  System.out.println(sum);

        int [][]arr= new int [3][3];
        int [][]  num ={
             {1,2,3},
             {4,5,6},
             {7,8,9}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }        
    
}