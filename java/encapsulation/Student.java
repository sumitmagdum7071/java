public class Student {
    private String name; // Encapsulated variable
    private int rollNumber; // Fixed variable name to match convention
    private int age; // Encapsulated variable

    // Setter for age with validation
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age! Setting age to 0.");
            this.age = 0; // Default to 0 if invalid
        } else {
            this.age = age;
        }
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return this.rollNumber;
    }
}





