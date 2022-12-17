package test4;

	import java.util.Objects;

	class Car {
	    public String model;
	    public String color;
	    public double price;

	    public Car(String model, String color, double price) {
	        this.model = model;
	        this.color = color;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "model: " + model + ", color: " + color + ", price: " + price;
	    }
		
	    // Note that it is generally necessary to override the hashCode method whenever equals method is overridden.
	    // In this case it is already overridden.
	    @Override
	    public int hashCode() {
	        return Objects.hash(model, color, price);
	    }
	  
	    // Your code goes here
	    // TODO override equals method so it compares each property of the object
	    @Override
	    public boolean equals (Object obj){
	      Car car = (Car) obj;
			return model.equals(car.model)
	          &&color.equals(car.color)
	          &&price==car.price;
	}

	// do not change this code
	public class Project {
	    public static void main(String[] args) {
	        Car car = new Car("Audi", "white", 25000.0);
	        Car car1 = new Car("Audi", "white", 25000.0);
			
	        // without equals method overridden it returns false, because it works as ==
	        if (car.equals(car1)) {
	            System.out.println("Two objects have same properties.");
	        } else {
	            System.out.println("Tow objects have different properties.");
	        }
	    }
	}
	}
