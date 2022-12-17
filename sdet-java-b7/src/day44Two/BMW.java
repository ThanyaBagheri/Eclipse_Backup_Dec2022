package day44Two;

public class BMW extends Car {
    @Override
    public void drive() {
        System.out.println("BMW is driving");
    }

    @Override
    public void turnLeft() {
        System.out.println("BMW is turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("BMW is turning right");
    }

    @Override
    public void stop() {
        System.out.println("BMW is stopped");
    }
}
