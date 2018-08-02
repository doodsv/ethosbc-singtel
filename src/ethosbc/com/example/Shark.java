package ethosbc.com.example;

import ethosbc.com.example.interfaces.IAnimalBehavior;
import ethosbc.com.example.interfaces.ISharkBehavior;

public class Shark extends Fish implements IAnimalBehavior, ISharkBehavior {

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
	public void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean feed(Animal prey) {
		// TODO Auto-generated method stub
		return false;
	}
}
