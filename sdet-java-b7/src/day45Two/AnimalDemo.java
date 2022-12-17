package day45Two;

public class AnimalDemo {
	public static void main(String[] args) {

		//AnimalInterface obj = new Eagle();
		Eagle obj = new Eagle();

		obj.eat();
		obj.sleep();
		obj.drink();
		obj.fly();

		AnimalInterface.printInFormat("Eagle");
		obj.run();
		// AnimalInterface.run();
	}
}
