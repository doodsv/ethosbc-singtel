package ethosbc.com.example;

import ethosbc.com.example.interfaces.IAnimalBehavior;
import ethosbc.com.example.interfaces.IParrotBehavior;

public class Duck extends Bird implements IAnimalBehavior, IParrotBehavior {

	private String palmateFeetColor;

	public String getPalmateFeetColor() {
		return palmateFeetColor;
	}

	public void setPalmateFeetColor(String color) {
		this.palmateFeetColor = color;
	}

	@Override
	public void makeSound() {
        System.out.println("Quack, quack");
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