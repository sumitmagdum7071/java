public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setters
        student.setName("Ram");
        student.setRollNumber(123);
        student.setAge(16);

        // Getting and printing values using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Age: " + student.getAge());
    }
}