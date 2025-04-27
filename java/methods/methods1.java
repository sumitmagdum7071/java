class methods1 { // Corrected class name to follow Java conventions
        public static void main(String[] args) {

            int[] a = {1, 2, 22, 3, 4, 5, 6, 7, 8};
            int z = sumOfArray(a); // Corrected method name to follow Java conventions
            System.out.println(z);
    
            
            int[] b = {44, 55, 66, 77, 88, 99};
            int s = sumOfArray(b); // Corrected method name to follow Java conventions
            System.out.println(s);
        }
    
        public static int sumOfArray(int[] arr) { // Corrected method name to follow Java conventions
            int res = 0;
            for (int i : arr) {
                res += i;
            }
            return res; // Removed the duplicate return statement
        }
    }

    
