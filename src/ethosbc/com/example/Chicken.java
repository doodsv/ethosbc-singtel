package ethosbc.com.example;

import ethosbc.com.example.interfaces.IAnimalBehavior;
import ethosbc.com.example.interfaces.IParrotBehavior;

public class Chicken extends Bird implements IAnimalBehavior, IParrotBehavior {

	private int combLength;

	public int getCombLength() {
		return combLength;
	}

	@Override
	public void makeSound() {
        System.out.println("Cluck, cluck");
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
		// TODO Auto-generated method stub
		return false;
	}
}