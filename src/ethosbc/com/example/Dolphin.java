package ethosbc.com.example;

import ethosbc.com.example.interfaces.IFishBehavior;

public class Dolphin extends Animal implements IFishBehavior {

	// implement the fish behavior interface since a dolphin can swim but is not really a fish
	@Override
	public void swim() {
		System.out.println("The dolphin is swimming.");
	}
}