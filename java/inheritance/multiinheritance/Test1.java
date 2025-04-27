public class Test1 {
    public static void main(String[] args) {
        Child child = new Child();

        // Access Grandparent methods
        child.setName("John");
        child.setAge(70);

        // Access Parent methods
        child.setOccupation("Engineer");

        // Access Child methods
        child.setSchool("Greenwood High");

        System.out.println("Name: " + child.getName());
        System.out.println("Age: " + child.getAge());
        System.out.println("Occupation: " + child.getOccupation());
        System.out.println("School: " + child.getSchool());
    }
}