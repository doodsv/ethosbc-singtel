package ethosbc.com.example;

import ethosbc.com.example.interfaces.IAnimalBehavior;
import ethosbc.com.example.interfaces.IClownFishBehavior;

public class ClownFish extends Fish implements IAnimalBehavior, IClownFishBehavior {

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
	public void doJoke() {
		// TODO Auto-generated method stub
		
	}

}
