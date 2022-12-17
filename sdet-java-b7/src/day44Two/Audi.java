package day44Two;


public class Audi extends Car {
    @Override
    public void drive() {
        System.out.println("Audi is driving");
    }

    @Override
    public void turnLeft() {
        System.out.println("Audi is turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Audi is turning right");
    }

    @Override
    public void stop() {
        System.out.println("Audi is stopped");
    }
}
