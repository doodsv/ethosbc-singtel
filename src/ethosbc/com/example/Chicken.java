package ethosbc.com.example;

import ethosbc.com.example.interfaces.IAnimalBehavior;
import ethosbc.com.example.interfaces.IBirdBehavior;

public class Chicken extends Bird implements IAnimalBehavior, IBirdBehavior {

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
		System.out.println("Cluck, cluck");
	}

	@Override
	public boolean makeSound(String sound) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean makeSound(Animal companion) {
		// TODO Auto-generated method stub
		return false;
	}
}