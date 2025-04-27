public class Test {
    public static void main(String[] args) {
        // Using the default constructor
        Person person1 = new Person();
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Using the parameterized constructor
        Person person2 = new Person("John", 25);
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}