class Dog extends Animal implements Pet{
    Dog(String name) {
        super(name);
    }

    //Here we are implementing the abstract method from the Animal abstract class
    @Override
    void makeSound() {
        System.out.println(name + " says woof!");
    }

    //Implementation of the method from the Pet interface
    @Override
    public void play() {
        System.out.println(name + " is playing fetch!");
    }
}