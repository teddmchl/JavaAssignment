abstract class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    abstract void makeSound();//This is the abstract method and has to be implemented in child classes

    void eat(){//This is the concrete method
        System.out.println(name + " is eating");
    }
}
