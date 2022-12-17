package day44Two;

import util.InputFromUser;

public class Cartest {
    public static void main(String[] args) {
        // TODO integrate Honda into our CarTest software
        // 1. Honda should extend the abstract Car class
        // 2. Changes in CarTest so honda can be used when user
        //    types honda or Honda
        Car car;

        String carToTest = InputFromUser.getInput("Car to test:");
        carToTest = carToTest.toLowerCase();

        switch (carToTest) {
            case "audi":
                car = new Audi();
                break;
            case "bmw":
                car = new BMW();
                break;
            case "honda":
                car = new Honda();
                break;
            default:
                throw new IllegalArgumentException("Unsupported car: " + carToTest);
        }

        car.drive();
        car.turnLeft();
        car.drive();
        car.turnRight();
        car.stop();
        double speed = car.getSpeed();
        // more code...
    }
}
