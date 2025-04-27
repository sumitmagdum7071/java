public class Test9 {

    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.speed = 70;
        car.brand = "Tata";
    
        car.accelerate(1);
        System.out.println(car.speed);
    }
}

class Car {
    String color;
    int speed;
    String brand;
    
    void accelerate(int increment) {
        speed += increment;
    }
}
