package day44Two;
//In Java, we can achieve abstraction:
//1. with abstract classes
//2. with interfaces

//Abstraction is when we focus on what object does instead of
//how it does. We create abstract structure with abstract methods.
//And then when concrete class implements our abstraction it
//must implement (Override) all abstract methods.
//- we cannot create object out of abstract class directly
//- abstraction becomes useful when we have concrete classes.
//Concrete class is non-abstract class that extends abstract class
//or interface.
//- The concrete classes must implement all abstract methods from abstraction.
//Implement means override.

public abstract class Car {
    public double speed;

    public abstract void drive();
    public abstract void turnLeft();
    public abstract void turnRight();
    public abstract void stop();

    public double getSpeed() {
        return speed;
    }
}
