package ethosbc.com.example;

import ethosbc.com.example.interfaces.IAnimalBehavior;

public class Fish extends Animal implements IAnimalBehavior {
	
	private int finSpan;

	public int getFinSpan() {
		return finSpan;
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
