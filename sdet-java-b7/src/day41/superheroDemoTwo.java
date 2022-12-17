package day41;

public class superheroDemoTwo {
	public static void main(String[] args) {
		Superhero s1 = new Superhero("OnepunchMan",3);
		Superhero s2 = s1;
		// more pointer that point to the same obj
		s2.name = "Naruto";
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		System.out.println("----");
		
		Superhero s3 = new Superhero("Mario", 5);
		System.out.println(s3.name);//Mario
		System.out.println(s3.powerLevel);//5
	}
}
