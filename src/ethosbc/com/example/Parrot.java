package ethosbc.com.example;

import ethosbc.com.example.interfaces.IAnimalBehavior;
import ethosbc.com.example.interfaces.IBirdBehavior;

public class Parrot extends Bird implements IAnimalBehavior, IBirdBehavior {
	
	private Animal companion;

	@Override
	public boolean doAction(String action) {
		boolean ret = false;
		if (null != action && !action.isEmpty()) {
			System.out.println(action);
			ret = true;
		}
		return ret;
	}

	@Override
	public void makeSound() {
		System.out.println("default parrot sound");
	}

	@Override
	public boolean makeSound(String sound) {
		boolean ret = false;
		if (null != sound && !sound.isEmpty()) {
			System.out.println(sound);
			ret = true;
		}
		return ret;
	}
	
	@Override
	public boolean makeSound(Animal companion) {
		boolean ret = false;
		if (null != companion) {
			if (companion instanceof Dog) {
				System.out.println("Woof, woof");
			} else if (companion instanceof Cat) {
				System.out.println("Meow");
			} else if (companion instanceof Chicken) {
				System.out.println("Cock-a-doodle-doo");
			} else if (companion instanceof Duck) {
				System.out.println("Quack, quack");
			} else {
				System.out.println("default parrot sound");
			}
			ret = true;
		}
		return ret;
	}

	public Animal getCompanion() {
		return companion;
	}

	public void setCompanion(Animal companion) {
		this.companion = companion;
	}
}