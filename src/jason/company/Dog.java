package jason.company;

public class Dog extends Animal {
    // EXTENDS...

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // CONSTRUCTOR - notice super!!
    // this class now inherits the STATE and BEHAVIOR of the Animal class
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // to super
        // SUPER calls the constructor of the class we are extending from
//        super(name, brain, body, size, weight);
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("dog.chew() called");
    }

    // we can override our eat method on Animal
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        // we use super to call the Animal.eat() method
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
//        super.move(5);
        // or
        // if you don't specify SUPER it gives you the ability to OVERRIDE (CMD N) it and call the one that is closest, i.e. the one on the Dog class
        super.move(5);
    }

    private void moveLegs(int speed) {
        System.out.println("DOg.moveLegs() called. Speed is " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }





    //    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
//        super(name, brain, body, size, weight);
//        this.eyes = eyes;
//        this.legs = legs;
//        this.tail = tail;
//        this.teeth = teeth;
//        this.coat = coat;
//    }
}
