class recurison {
    public static void main(String[] args){

            System.err.println (factorial(5));

    }
    public static int factorial(int n) {
    //     int res =1;
    //       for(int i = 1; i <= n; i++){
    //         res = res * i;
    //       }
    //   return res; 

    // this are the smapla methad 

    
     if ( n== 1){
      return 1;
     }
     return n * factorial(n-1);
    }
      
        
  }
  
