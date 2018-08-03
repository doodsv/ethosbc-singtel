package ethosbc.com.example;

import ethosbc.com.example.interfaces.IBirdBehavior;

public class Butterfly extends Animal implements IBirdBehavior {

	// implement the bird behavior interface since a butterfly can fly but is not really a bird
	@Override
	public void fly() {
		System.out.println("The butterfly is flying.");
	}
}