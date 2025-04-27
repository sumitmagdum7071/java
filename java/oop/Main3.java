public class Main3 {
    public void fullThrottle(){
        System.out.println("the car is going as fast as it can!");
}
public void speed(int maxSpeed){
    System.out.println("Max speed is : +maxSpeed");

}
public static void main(String[] args) {
    Main3 mycar = new Main3();
    mycar.fullThrottle();
    mycar.speed(200);
}
}
