public class Main2 {
    static void myStaticMethod(){
        System.out.println("static method can be called without creating objects ");
    }
        public void myPublicMethod(){
            System.out.println("Pubilc methods must be called by creating obj");

        }

        public static void main(String[] args) {
            myStaticMethod();

            Main2 myObj = new Main2();
            myObj.myPublicMethod();
        }
    }

// static vs public methode