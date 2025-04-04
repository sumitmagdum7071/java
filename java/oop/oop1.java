public class oop1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.speed = 40;
        car.brand = "Tata";
        car.model = "Safari";

        car.accelerate(1);
        System.out.println(car.speed);
    }
}

class Car {
    String color;
    int speed;
    String brand;
    String model;

    void accelerate(int increment) {
        speed += increment;
    }
}