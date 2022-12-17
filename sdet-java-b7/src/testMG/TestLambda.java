package testMG;


import java.util.ArrayList;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "white", 2019));
        cars.add(new Car("Tesla", "black", 2021));
        cars.add(new Car("BMW", "white", 2018));
        cars.add(new Car("BMW", "red", 2017));
        cars.add(new Car("Audi", "blue", 2022));

        TestDrive.printDetails(cars,(Car car) -> {
        	String m = car.model;
        	String c = car.color;
        	int y = car.year;
        	return String.format("{model=%s, color=%s, year=%d}", m, c, y);
        });
    }
}


@FunctionalInterface
interface CarDetails {
    public abstract String getDetails(Car car);
}

class TestDrive {
    public static void printDetails(List<Car> cars, CarDetails carDetails) {
        for (Car car : cars) {
           System.out.println(carDetails.getDetails(car));
        }
    }
}

class Car {
    public String model;
    public String color;
    public int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void drive() {
        System.out.println(color + " "+ model + " is driving");
    }
}

