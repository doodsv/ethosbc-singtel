package ethosbc.com.example;

import ethosbc.com.example.interfaces.IAnimalBehavior;

public class Bird extends Animal implements IAnimalBehavior {

	private int wingSpan;

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingspan(int wingspan) {
		this.wingSpan = wingspan;
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