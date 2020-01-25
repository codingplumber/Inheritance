package jason.company;

public class Main {

    public static void main(String[] args) {
        // INHERITANCE
        // different kinds of objects have certain amount in common with each other
        // we can create classes to inherit STATE and BEHAVIOR from other classes
        // create basic classes that apply to many related things

        Animal animal = new Animal("animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        // eat is defined in the Animal class
        // dog is inheriting
        dog.eat();
        dog.walk();
        dog.run();

        Fish piranha = new Fish("piranha", 1, 1, 2, 2, 4);
        piranha.swim(11);
    }
}
