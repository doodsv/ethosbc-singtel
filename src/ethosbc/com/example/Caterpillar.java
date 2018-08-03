package ethosbc.com.example;

public class Caterpillar extends Animal {

	public Butterfly morph() {
		System.out.println("I am morphing.");
		return new Butterfly();
	}
}