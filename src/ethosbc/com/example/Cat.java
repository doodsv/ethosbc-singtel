package ethosbc.com.example;

import ethosbc.com.example.interfaces.IAnimalBehavior;

public class Cat extends Animal implements IAnimalBehavior {

	private int whiskerLength;

	public int getWhiskerLength() {
		return whiskerLength;
	}

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

}