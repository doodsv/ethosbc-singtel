package ethosbc.com.example.interfaces;

import ethosbc.com.example.Animal;

public interface IParrotBehavior {
	public void makeSound();
	public boolean makeSound(String sound);
	public boolean makeSound(Animal companion);
}
