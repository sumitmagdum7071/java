class Animal{
    public void AnimalSound(){
    System.out.println("the sound of animal");
}
}
class pig extends Animal{
    public void pigSound(){
        System.out.println("the pig sonud like: wee weee");
    }
}
class Dog extends Animal{
    public void DogSound(){
        System.out.println("the sonud like : bhoo bhoo");
    }
}
class Test {
    public static void main(String[] args) {
        Animal objAnimal = new Animal();
        Animal objpig =new pig();
        Animal objDog = new Dog();

        objAnimal.AnimalSound();
        objpig.AnimalSound();
        objDog.AnimalSound();

    }


}