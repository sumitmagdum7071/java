public class Main1 {
 int modelYear;
 String modelName;
 public Main1(int year, String name){
    modelName = name;
    modelYear = year;


 }  
 public static void main(String[] args) {
     Main1 myCar = new Main1(2020, mustang);
     System.out.println(myCar.modelYear+" "+myCar.modelName);
 }
 
}
