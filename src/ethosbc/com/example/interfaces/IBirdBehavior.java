package ethosbc.com.example.interfaces;

import ethosbc.com.example.Animal;

public interface IBirdBehavior {
	public void makeSound();
	public boolean makeSound(String sound);
	public boolean makeSound(Animal companion);
}
